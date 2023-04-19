package com.springtask1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
    public JavaLanguage JavaWorld() {
        return new JavaWorld();
    }
	
	@Bean
	public PythonLanguage PythonWorld(JavaLanguage javaLanguage) {
		return new PythonWorld(javaLanguage);
	}
}
