package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
public class MvcController {
	@RequestMapping("/")
	public String Home() {
		System.out.println("Going home...");
		return "index";
	}
	@GetMapping("/register")
	public String showForm(Model model) {
		System.out.println("going register form");
		User user=new User();
		model.addAttribute("user",user);
		System.out.println(user);
		return "register_form";
			}
	@PostMapping("/register1")
	public String submitForm(@Valid @ModelAttribute("user") User user,
	BindingResult bindingResult) {
	System.out.println(user);
	
	    if (bindingResult.hasErrors()) 
	    {       
	        return "register_form";
	    } 
	    else 
	    {
	        return "register_success";
	    }
	}

}
