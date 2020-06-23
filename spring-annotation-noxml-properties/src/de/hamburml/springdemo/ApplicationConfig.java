package de.hamburml.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("de.hamburml.springdemo") // can be removed, if only manually defined beans are used
@PropertySource("classpath:sport.properties")
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
