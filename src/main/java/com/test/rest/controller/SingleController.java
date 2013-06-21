package com.test.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SingleController {

    
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
	
    
    
	@RequestMapping(value="/other/{name}", method = RequestMethod.POST)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("parameter", name);
		return "list";

	}
	
}