package com.intothemobile.itmadmin.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.intothemobile.itmadmin" })
@MapperScan(basePackages = "com.intothemobile.itmadmin")
public class ItmadminApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ItmadminApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ItmadminApplication.class);
	}

}
