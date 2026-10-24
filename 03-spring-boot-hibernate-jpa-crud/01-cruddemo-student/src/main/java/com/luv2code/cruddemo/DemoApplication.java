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
			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		//create student object
		System.out.println("creating a new student...");
		Student tempStudent = new Student("jeff","chaad","jeff@gmail.com");

		//saving the student
		System.out.println("saving the student...");
		studentDAO.save(tempStudent);

		//display the id of the student
		int theId = tempStudent.getId();
		System.out.println("the student id is: " + theId);

		//retriving the student based on the id
		System.out.println("getting student with id " + theId);
		Student myStudent = studentDAO.findStudentById(theId);

		//displaying the student
		System.out.println("getting student with id " + myStudent);


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
