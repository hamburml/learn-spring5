package de.hamburml.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "cricket";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String e)
	{
		System.out.println("set email to :" + e);
		this.emailAddress = e;
	}
	
	public void setTeam(String t)
	{
		this.team = t;
	}
}