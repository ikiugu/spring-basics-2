package com.ikiugu.springdemo;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Backhand volley x10";
	}

}
