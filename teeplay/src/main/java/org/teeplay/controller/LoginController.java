package org.teeplay.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.teeplay.model.account.TableUser;
import org.teeplay.service.account.UserService;
import org.teeplay.util.TeeUtil;

import com.alibaba.fastjson.JSONObject;

@Controller
public class LoginController {
	
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public void isLogin(@RequestParam(required=true) String username,
			@RequestParam(required=true) String password,
			HttpServletRequest requ,
			HttpServletResponse resp,
			ModelAndView modelAndView){
		logger.info("[username:"+username+"][password:"+password+"]");
		JSONObject jo = new JSONObject();
		boolean flag = false;
		String message = "用户名或密码错误";
		if(TeeUtil.isNullEmpty(username) || TeeUtil.isNullEmpty(password)){
			message = "用户名或密码不能为空";
		}else{
			try{
				UsernamePasswordToken token = new UsernamePasswordToken(username, password);
				token.setRememberMe(true);
				Subject subject = SecurityUtils.getSubject();
				subject.login(token);
				resp.sendRedirect("/");
				return;
			}catch(AuthenticationException e){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		jo.put("success", flag);
		jo.put("message", message);
		TeeUtil.writeToJson(jo, resp);
	}
	

	@RequestMapping(value = "/register",method=RequestMethod.POST)
    @RequiresRoles("admin")
    public String register(@RequestParam(required=true) String username,
			@RequestParam(required=true) String password,
			@RequestParam(required=true) String email,
			HttpServletRequest requ,
			HttpServletResponse resp){
		TableUser user = new TableUser();
		user.setEmail(email);
		user.setName(username);
		user.setPassword(password);
		logger.info(user.toString());
        TableUser u = userService.regist(user);
        if(u!=null){
        		return "/login";
        }
        return "/regist";
    }
}
