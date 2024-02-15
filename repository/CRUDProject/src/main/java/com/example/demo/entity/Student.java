package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Student")
public @Data class Student {
	
	@Id
	
	private String id;
	public Student(String id, String name, String rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	public Student() {
	}
	private String name;
	private String rollno;

}
