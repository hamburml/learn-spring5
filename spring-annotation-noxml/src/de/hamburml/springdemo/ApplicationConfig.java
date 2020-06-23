package de.hamburml.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("de.hamburml.springdemo") // can be removed, if only manually defined beans are used
public class ApplicationConfig {

	@Bean
	public Coach trackCoach() {
		return new TrackCoach();
	};
	
	@Bean
	public FortuneService fortuneService() {
		return new HappyFortuneService();
	}
	
	
	
	
}
