package com.ecommerce.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

      @GetMapping("/hello")
        public String hello() {
            return "hola new aas";
        } 
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}



