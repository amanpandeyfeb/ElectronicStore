package com.lcwd.electronic.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;
@Configuration
public class ProjectConfig {
	
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
}

