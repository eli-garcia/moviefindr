package com.moviefindr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class MoviefindrController {
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String read() {
		return "index";
	}
}
