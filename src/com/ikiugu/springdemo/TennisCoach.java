package com.ikiugu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private HappyFortuneService happyFortuneService;
	
	public TennisCoach() {
		System.out.println(">> Tennis coach constructor");
	}
	
	/*
	 * public TennisCoach(HappyFortuneService theFortuneService) {
	 * this.happyFortuneService = theFortuneService; }
	 */

	
	@Override
	public String getDailyWorkout() {
		return "Backhand volley x10";
	}

	@Autowired
	public void thisIsAweirdNameForThis(HappyFortuneService happyFortuneService) {
		this.happyFortuneService = happyFortuneService;
	}

	@Override
	public String getDailyFortune() {
		return happyFortuneService.getFortune();
	}

}
