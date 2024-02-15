package com.example.demo.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentService;

@RestController
public class Controller {
    
    @Autowired
    public StudentService stuserv;
    
    @RequestMapping("/student")
    public List<Student> getAllStudent(){
        return stuserv.getAllStudent();
    }

    @RequestMapping(method = RequestMethod.POST, value="/student")
    public ResponseEntity<String> addStudent(@RequestBody Student stu) {
        stuserv.addStudent(stu);
        return ResponseEntity.status(HttpStatus.CREATED).body("Student added successfully");
    }
    
    @RequestMapping(method = RequestMethod.PUT, value="/student/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable String id, @RequestBody Student stu) {
        stuserv.updateStudent(id, stu);
        return ResponseEntity.status(HttpStatus.OK).body("Student updated successfully");
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id) {
        stuserv.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.OK).body("Student deleted successfully");
    }
}
