package com.example.webstart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication  //开启自动配置
public class WebstartApplication {

	@Value("${project.author}")
	private String author;
	@Value("${project.createtime}")
	private String createTime;

	@RequestMapping("/")
	String hello(){
		return "hello spring boot" +author +" "+createTime;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebstartApplication.class, args);
	}

}
