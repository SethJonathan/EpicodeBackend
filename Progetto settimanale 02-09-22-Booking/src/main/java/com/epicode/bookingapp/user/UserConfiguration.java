package com.epicode.bookingapp.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

	@Bean("user1")
	public User newUser1() {
		return new User("Mario","Mario Rossi","rossimario@gmail.com");
	}
	@Bean("user2")
	public User newUser2() {
		return new User("Giovanni","Giovanni Muciacia","giovmucia@gmail.com");
	}
	@Bean("user3")
	public User newUser3() {
		return new User("Mike","Mike Buongiorno","mikebuongiorno@gmail.com");
	}
}
