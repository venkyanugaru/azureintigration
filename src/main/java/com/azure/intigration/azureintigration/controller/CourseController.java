package com.azure.intigration.azureintigration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.azure.intigration.azureintigration.entity.Course;
import com.azure.intigration.azureintigration.repository.CourseRepository;
@RestController
public class CourseController {
    

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
}
