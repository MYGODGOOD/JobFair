package com.zp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.zp.dao")
@EnableSwagger2
@SpringBootApplication
public class JobfairApplication {

	public static void main(String[] args) {

		SpringApplication.run(JobfairApplication.class, args);
	}

}
