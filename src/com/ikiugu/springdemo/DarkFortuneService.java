package com.ikiugu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DarkFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Maybe this is the day??";
	}

}
