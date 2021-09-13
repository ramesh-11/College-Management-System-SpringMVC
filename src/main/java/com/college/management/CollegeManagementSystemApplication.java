package com.college.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.college.management.student.entity.Student;
import com.college.management.student.repository.StudentRepository;

@SpringBootApplication
public class CollegeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Ramesh", "Singh", "ramesh@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Sukanto", "Paul", "sukanto@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Ravi", "Yadaw", "ravi@gmail.com");
		studentRepository.save(student3);
		
		Student student4 = new Student("Dibyendu", "Chottoraj", "dibyendu@gmail.com");
		studentRepository.save(student4);
		
		Student student5 = new Student("Abhishek", "Sharma", "abhishek@gmail.com");
		studentRepository.save(student5);
	}
}
