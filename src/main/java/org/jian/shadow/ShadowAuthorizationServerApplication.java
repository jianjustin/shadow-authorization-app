package org.jian.shadow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ShadowAuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShadowAuthorizationServerApplication.class, args);
	}

}
