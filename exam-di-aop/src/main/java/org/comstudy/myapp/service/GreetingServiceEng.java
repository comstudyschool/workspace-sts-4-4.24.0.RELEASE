package org.comstudy.myapp.service;

public class GreetingServiceEng implements GreetingService {
	public GreetingServiceEng() {
		System.out.println(">>> GreetingServiceEng Constructor");
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hello world");
	}
}
