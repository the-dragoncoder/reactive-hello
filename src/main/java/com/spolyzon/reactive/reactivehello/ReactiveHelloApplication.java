package com.spolyzon.reactive.reactivehello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveHelloApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReactiveHelloApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReactiveHelloApplication.class, args);
	}

}
