package com.tshaped.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tshaped.services.Password;

@Configuration
public class Config 
{
	public Config()
	{
		System.out.println("Config Bean Created");
	}
	
	@Bean
	public Password createPass()
	{
		return new Password();
	}

}
