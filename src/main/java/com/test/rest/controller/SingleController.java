package com.test.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SingleController {
	

    
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login(ModelMap model) {
		model.addAttribute("error", "error en index");
		return "login";
	}
	
	@RequestMapping(value ="/test", method = RequestMethod.POST , consumes = "application/json", produces = "application/json")
    public  @ResponseBody Output  helloWorld(@RequestBody  Input input){
		System.out.println("llegando request" + input.getUser() + "Password " +input.getPassword());
		return new Output();
    }
    
	@RequestMapping(value="/other/{name}", method = RequestMethod.POST)
	public String getMovie(@PathVariable String name, ModelMap model) {

		//.addAttribute("parameter", name);
		return "list";

	}
	
}
