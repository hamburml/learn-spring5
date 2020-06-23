package de.hamburml.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoXMLConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Coach myCoach = context.getBean("trackCoach", TrackCoach.class);
		
		System.out.println(myCoach.getDailyFortune());
		
	}

}
