package com.luv2code.cruddemo;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	public void createStudent(StudentDAO studentDAO) {
		//Crate the student obj
		System.out.println("Creating Student");
        Student tempStudent = new Student("adam","paul","adam@email");

		//Saving the student
		System.out.println("Saving Student");
		studentDAO.save(tempStudent);

		//displaying student by id
		System.out.println("retreving Student by ID: " +  tempStudent.getId());
	}





}
