package com.challenge.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
// @EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
// @ComponentScan(basePackages = {"es.unileon.inso2"})
// @EntityScan("es.unileon.inso2.model")
// @EnableJpaRepositories("es.unileon.inso2.repository")
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class EventmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApplication.class, args);
	}

}
