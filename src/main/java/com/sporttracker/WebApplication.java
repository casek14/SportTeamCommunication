package com.sporttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.sporttracker.app.web.config.FreeMarkerConfig;

@SpringBootApplication
@Import({ FreeMarkerConfig.class })
public class WebApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
	}
}
