package com.hand.interceptor;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

public class Event implements ApplicationListener<ApplicationEvent> {


	public void onApplicationEvent(ApplicationEvent event) {

		 if (event instanceof ContextRefreshedEvent) {

			System.out.println("Context Start");

		 } else if (event instanceof ContextClosedEvent) {

			System.out.println("Context stop");

		 } else {

		}

	}


}