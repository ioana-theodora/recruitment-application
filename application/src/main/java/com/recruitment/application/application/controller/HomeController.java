package com.recruitment.application.application.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.recruitment.application.application.constants.RoleConstants;

@Controller
public class HomeController {

	@GetMapping("/")
    public String home(HttpServletRequest request,Model model) {
        return handleHome(request, model);
    }
	
	@GetMapping("/home")
    public String home2(HttpServletRequest request,Model model) {
        return handleHome(request, model);
    }
	
	private String handleHome(HttpServletRequest request,Model model){
		if(request.isUserInRole(RoleConstants.ADMIN)){
			 return "home/homeadmin";
		}  
		return "home/home";
	}
	
}
