package com.teressas.fruityloops;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	@GetMapping("/home")
    public String test() {
		return null;
		
    }

	
}
