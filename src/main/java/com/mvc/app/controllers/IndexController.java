package com.mvc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	
	@GetMapping({"/index","","/home","/"})
	public String index(Model model){
		return "index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model){
		return "perfil";
	}


}
