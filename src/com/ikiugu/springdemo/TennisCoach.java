package com.ikiugu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private HappyFortuneService happyFortuneService;
	
	@Autowired
	public TennisCoach(HappyFortuneService theFortuneService) {
		this.happyFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Backhand volley x10";
	}

	@Override
	public String getDailyFortune() {
		return happyFortuneService.getFortune();
	}

}
