package de.hamburml.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TrackCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	private int numberOfWorkouts = 0;

	@Override
	public String getDailyWorkout() {
		numberOfWorkouts++;
		return numberOfWorkouts + "| Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	@Bean(initMethod = "initTrackCoach")
	public void initTrackCoach() {
		System.out.println("trackcoach will be initialized");
	}

	@Bean(destroyMethod = "close")
	public void close() {
		System.out.println("trackcoach will be destroyed");
	}

}