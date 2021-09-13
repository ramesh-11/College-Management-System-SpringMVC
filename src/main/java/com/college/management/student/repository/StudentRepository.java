package com.college.management.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.management.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
