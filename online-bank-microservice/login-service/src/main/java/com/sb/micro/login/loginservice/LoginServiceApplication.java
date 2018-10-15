package com.sb.micro.login.loginservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("com.sb.micro.login.vo")
@EnableTransactionManagement
@ComponentScan(basePackages="com.sb.micro.login.*")
public class LoginServiceApplication 
{
	public static void main(String[] args)
	{
		SpringApplication.run(LoginServiceApplication.class, args);
	}
}
