package com.example.demo.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.example.demo.Repo.Repository;
import com.example.demo.entity.Student;

@Service
public class StudentService {
    
    @Autowired
    public Repository repo;
    
    public List<Student> getAllStudent(){
        List<Student> stu = new ArrayList<>();
        repo.findAll().forEach(stu::add);
        return stu;
    }
    
    public void addStudent(Student stu) {
        repo.save(stu);
    }
    
    public void updateStudent(String id, Student stu) {
        repo.save(stu);
    }
    
    public void deleteStudent(String id) {
        repo.deleteById(id);
    }
}
