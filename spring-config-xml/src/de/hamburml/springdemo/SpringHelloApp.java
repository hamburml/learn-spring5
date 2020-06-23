package de.hamburml.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		// initialie spring context with xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// let spring create "myCoach" bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		Coach cricket = context.getBean("cricketCoach", Coach.class);
		
		System.out.println(cricket.getDailyWorkout());
		
		context.close();
		
	}
}