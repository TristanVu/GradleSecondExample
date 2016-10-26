package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.context.annotation.Configuration("mainBean")
@EnableJpaRepositories(basePackages = "com.example.repo")
@ComponentScan(basePackages = "com.example")
@PropertySource("${spring.config.name}")
@Import(JPAConfig.class)
@Transactional
public class AppConfig {
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
