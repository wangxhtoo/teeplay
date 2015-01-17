package org.teeplay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teeplay.service.account.UserService;

@Controller
public class TeeplayController {
	
	private static final Logger logger = LoggerFactory.getLogger(TeeplayController.class);
	
	@RequestMapping(value="/")
	public String index(HttpServletRequest req,HttpServletResponse rep,Model model){
		return "/index";
		
	}
	@RequestMapping(value="/about")
	public String about(HttpServletRequest req,HttpServletResponse rep,Model model){
		return "/about";
		
	}
	@RequestMapping(value="/services")
	public String services(HttpServletRequest req,HttpServletResponse rep,Model model){
		return "/services";
		
	}
	@RequestMapping(value="/marketing")
	public String marketing(HttpServletRequest req,HttpServletResponse rep,Model model){
		return "/marketing";
		
	}
	@RequestMapping(value="/contact")
	public String contact(HttpServletRequest req,HttpServletResponse rep,Model model){
		return "/contact";
		
	}
}
