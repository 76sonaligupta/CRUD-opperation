package com.example.demo.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;


public interface Repository extends JpaRepository<Student, String> {

	

}
