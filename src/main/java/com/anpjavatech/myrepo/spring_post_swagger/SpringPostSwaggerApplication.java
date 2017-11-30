package com.anpjavatech.myrepo.spring_post_swagger;

import com.anpjavatech.myrepo.spring_post_swagger.configuration.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPostSwaggerApplication {

	public static void main(String[] args) {
		Class[] configurations = {SwaggerConfig.class, SpringPostSwaggerApplication.class};
		SpringApplication.run(configurations, args);
	}
}
