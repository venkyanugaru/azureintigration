package com.azure.intigration.azureintigration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages={"com.azure.intigration"})
public class AzureintigrationApplication {

@Autowired
private CourseRepository repository;

@GetMapping("/courses")
	public List<Course> getAllCOurses(){
		
		return repository.findAll();
	}
@PostMapping("/course")
	public Course saveCourse(@RequestBody Course course){
		return repository.save(course);
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureintigrationApplication.class, args);
	}

}
