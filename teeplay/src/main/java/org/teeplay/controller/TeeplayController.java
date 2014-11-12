package org.teeplay.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.teeplay.model.Teeplay;
import org.teeplay.model.account.TeeUser;
import org.teeplay.service.account.UserService;
import org.teeplay.util.HttpUtils;
import org.teeplay.util.TeeUtil;

import com.alibaba.fastjson.JSON;

@Controller
public class TeeplayController {
	
	private static final Logger logger = LoggerFactory.getLogger(TeeplayController.class);
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/")
	public String toLogin(HttpServletRequest req,HttpServletResponse rep,Model model){
		logger.info("TeeplayController ====> toLogin");
		return "/login";
		
	}
	
	@RequestMapping(value="/index")
	public String index(HttpServletRequest req,HttpServletResponse rep,Model model){
		logger.info("TeeplayController ====> index");
		TeeUser u = (TeeUser) req.getSession().getAttribute(TeeUtil.SESSION_USER);
		logger.info("TeeplayController ====> index ====>" + u.toString());
		req.setAttribute("user", u);
		return "/index";
		
	}
	
	@RequestMapping(value="/login")
	public void login(@RequestParam(value="username") String username,
				@RequestParam(value="password") String password,
				HttpServletRequest resq,HttpServletResponse resp) throws IOException{
		logger.info("TeeplayController ====> login");
		
		Teeplay tee = new Teeplay();
		
		TeeUser u = userService.getUserByEmail(username);
		if(u == null){
			tee.setResult(false);
			tee.setMsg("账户不存在");
		}else{
			if(!u.getPassword().equals(password)){
				tee.setResult(false);
				tee.setMsg("用户名或密码错误");
			}else{
				resq.getSession().setAttribute(TeeUtil.SESSION_USER, u);
				tee.setResult(true);
				tee.setMsg("登陆成功");
			}
		}
		HttpUtils.renderJson(resp, tee);
		return;
	}
}
