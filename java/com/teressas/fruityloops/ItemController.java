package com.teressas.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ItemController {
	
	@RequestMapping("/")
	 public String index(Model model) {
	     
	     ArrayList<Item> fruits = new ArrayList<Item>();
	     Item a = new Item("Kiwi", 1.5);
	     fruits.add(a);
	     Item b = new Item("Mango", 2.0);
	     fruits.add(b);
	     Item c = new Item("Goji Berries", 4.0);
	     fruits.add(c);
	     Item d = new Item("Guava", .75);
	     fruits.add(d);
	     
	     // Add fruits your view model here
	     model.addAttribute("fruitsController", fruits);
	     return "index.jsp";
	 }

}




