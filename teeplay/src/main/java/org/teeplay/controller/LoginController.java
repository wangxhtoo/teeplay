package org.teeplay.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.teeplay.model.account.TeeUser;
import org.teeplay.service.account.UserService;
import org.teeplay.util.TeeUtil;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public void isLogin(@RequestParam(required=true) String username,
			@RequestParam(required=true) String password,HttpServletResponse resp,
			ModelAndView modelAndView){
		boolean flag = false;
		System.out.println(username + "=========" + password);
		TeeUser tee = userService.getUserByEmail(username);
		if(tee != null){
			flag = true;
		}
//		modelAndView.addObject("user", tee);
		TeeUtil.writeToJson("{'success':'"+flag+"'}", resp);
	}
}
