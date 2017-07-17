package com.recruitment.application.application;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module.Feature;

@Configuration
@EntityScan("com.recruitment.application.application.domain")
@EnableJpaRepositories("com.recruitment.application.application.repository")
public class JpaConfiguration {

	@Bean
	public Module parameterNamesModule() {
		Hibernate5Module module = new Hibernate5Module();
		module.disable(Feature.USE_TRANSIENT_ANNOTATION);
		module.enable(Feature.FORCE_LAZY_LOADING);
		return module;
	}

}
