package com.example.Students.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Students.Repository.StudentRepository;
import com.example.Students.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student s) {
		return repo.save(s);
	}
	
	public List<Student> getStudent() {
		return repo.findAll();
	}
	
	public String deleteStudent(Long id) {
		Student s=repo.findById(id).orElseThrow(()->new RuntimeException("Student not found: "+id));
		repo.delete(s);
		return "data deleted";
	}
}
