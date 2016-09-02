package com.movieflix.movieflix_core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class Users {

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String addMovies() {
		return null;

	}

}
