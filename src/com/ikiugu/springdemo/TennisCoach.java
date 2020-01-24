package com.ikiugu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("darkFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> Tennis coach constructor");
	}
	
	/*
	 * @Autowired public TennisCoach(@Qualifier("darkFortuneService") FortuneService
	 * fortuneService) { this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Backhand volley x10";
	}

	/*
	 * @Autowired public void thisIsAweirdNameForThis(HappyFortuneService
	 * happyFortuneService) { this.happyFortuneService = happyFortuneService; }
	 */

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
