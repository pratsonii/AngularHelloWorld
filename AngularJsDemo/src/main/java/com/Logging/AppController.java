package com.Logging;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/test")
	public User getName()
	{
		User u = new User("Pratii");
		return u;
	}
}
