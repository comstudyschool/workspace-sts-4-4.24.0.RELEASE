package org.comstudy.myapp.controller;

import org.comstudy.myapp.service.GreetingService;

public class HomeController {

	private GreetingService service;
	
	public HomeController(GreetingService service) {
		this.service = service;
		System.out.println(">>> HomeController 생성자");
		
		execute();
	}
	
	public void execute() {
		service.sayHello();
	}
}
