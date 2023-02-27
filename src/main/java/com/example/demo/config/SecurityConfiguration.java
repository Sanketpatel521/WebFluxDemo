package com.example.demo.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfiguration
{
	@Bean
	MapReactiveUserDetailsService userDetailsService() {
		UserDetails user1 = User.builder().username("user1").password("P@ss1")
				.roles("MONGO").build();
		UserDetails user2 = User.builder().username("user2").password("P@ss2").roles("SQL")
				.build();

		return new MapReactiveUserDetailsService(user1, user2);
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}


}




