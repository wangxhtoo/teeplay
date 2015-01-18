package org.teeplay.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.teeplay.model.account.TeeUser;
import org.teeplay.service.account.UserService;
import org.teeplay.util.HttpUtils;
import org.teeplay.util.TeeUtil;

import com.alibaba.fastjson.JSONObject;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public void isLogin(@RequestParam(required=true) String username,
			@RequestParam(required=true) String password,
			HttpServletRequest requ,
			HttpServletResponse resp,
			ModelAndView modelAndView){
		JSONObject jo = new JSONObject();
		boolean flag = false;
		String message = "用户名或密码错误";
		if(TeeUtil.isNullEmpty(username) || TeeUtil.isNullEmpty(password)){
			message = "用户名或密码不能为空";
		}else{

			TeeUser user = userService.getUserByUP(username, password);
			if(user != null){
				flag = true;
				message = "登录成功";
				try {
					Cookie cookie = new Cookie(TeeUtil.COOKIE_USERNAME, user.getName() != null ? URLEncoder.encode(user.getName(), "utf-8")
							: null);
					cookie.setDomain(TeeUtil.COOKIE_DOMAIN);
					cookie.setPath("/");
					cookie.setMaxAge(HttpUtils.COOKIE_TIME);
					resp.addCookie(cookie);
		
					Cookie cookie2 = new Cookie(TeeUtil.COOKIE_EMAIL, user.getEmail());
					cookie2.setDomain(TeeUtil.COOKIE_DOMAIN);
					cookie2.setPath("/");
					cookie2.setMaxAge(HttpUtils.COOKIE_TIME);
					resp.addCookie(cookie2);
		
					Cookie cookie4 = new Cookie("isLogin", "1");
					cookie4.setDomain(TeeUtil.COOKIE_DOMAIN);
					cookie4.setPath("/");
					cookie4.setMaxAge(HttpUtils.COOKIE_TIME);
					resp.addCookie(cookie4);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		}
		jo.put("success", flag);
		jo.put("message", message);
		TeeUtil.writeToJson(jo, resp);
	}
}
