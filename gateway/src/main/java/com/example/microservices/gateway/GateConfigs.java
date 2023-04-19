package com.example.microservices.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class GateConfigs extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
			.withUser("kiran")
			.password("kumar")
			.roles("admin")
			.and()
			.withUser("anil")
			.password("78901")
			.roles("user");
		
	}
	
	protected void configure(HttpSecurity http) throws Exception{
		http.httpBasic()
			.and()
			.authorizeHttpRequests()
			.antMatchers("/notes/delete").hasRole("admin")
			.antMatchers("/comments/all").hasAnyRole("user","admin")
			.and()
			.formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
