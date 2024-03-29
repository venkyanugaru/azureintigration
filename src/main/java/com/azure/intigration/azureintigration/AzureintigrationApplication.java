package com.azure.intigration.azureintigration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.azure.intigration.azureintigration.entity.Course;
import com.azure.intigration.azureintigration.repository.CourseRepository;

@SpringBootApplication
@RestController
@ComponentScan(basePackages={"com.azure.intigration"})
public class AzureintigrationApplication {



	public static void main(String[] args) {
		SpringApplication.run(AzureintigrationApplication.class, args);
	}

}
