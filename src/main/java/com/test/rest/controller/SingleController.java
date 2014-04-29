package com.test.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.rest.bean.Input;
import com.test.rest.bean.Output;

@Controller
public class SingleController {

	/**
	 * Para probar desde la parte web no se necesita json ya que es un peticion tipo GET.
	 * @author Javier Alexander Bravo Rosales(jbravor@anzen.com.mx)
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login(ModelMap model) {
		model.addAttribute("error", "error en index");
		System.out.println("Entro a index : ");
		return "login";
	}

	/**
	 * Json para realizar prueba desde la parte web: { "user":"userDummy", "password":"pass123"
	 * }
	 * @author Javier Alexander Bravo Rosales(jbravor@anzen.com.mx)
	 * @param input
	 * @return
	 */
	@RequestMapping(value = "/test", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody
	Output helloWorld(@RequestBody Input input) {
		System.out.println("llegando request: " + input.getUser() + "Password " + input.getPassword());
		Output out = new Output();
		out.setIdClient("testID");
		out.setIdSession("testSessionID");
		out.setIdVersion("testVersionID");
		return out;
	}

	/**
	 * Para probar desde la parte web usar una entrada como esta:
	 * http://localhost:8080/mfmApi/other/xxx (xxx cualquier caracter,letra o numero)
	 * @author Javier Alexander Bravo Rosales(jbravor@anzen.com.mx)
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/other/{name}", method = RequestMethod.POST)
	public String getMovie(@PathVariable String name, ModelMap model) {
		System.out.println("Entrando a other-name");
		return "list";

	}

}
