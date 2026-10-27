package com.example.Students.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Students.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
