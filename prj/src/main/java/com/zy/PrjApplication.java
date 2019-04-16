package com.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.zy.mapper")
@ServletComponentScan("com.zy.filter")
public class PrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrjApplication.class, args);
	}

}
