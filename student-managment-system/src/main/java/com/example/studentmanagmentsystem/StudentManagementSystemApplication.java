package com.example.studentmanagmentsystem;

import com.example.studentmanagmentsystem.entity.Student;
import com.example.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	public  void run(String... args) throws  Exception{
//		Student std1 = new Student("mike","makonnen", "mike@gmail.com");
//		Student std2 = new Student("abe","tony", "tony@gmail.com");
//		Student std3 = new Student("david","ramos", "ramos@gmail.com");
//		studentRepository.save(std1);
//		studentRepository.save(std2);
//		studentRepository.save(std3);

	}



}
