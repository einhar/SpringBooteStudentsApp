package com.ehr.Service;

import com.ehr.Dao.*;
import com.ehr.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mysql")
    private StudentDao fakeStudentDaoImpl;

    public Collection<Student> getAllStudents() {
        return fakeStudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id) {
        return fakeStudentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.fakeStudentDaoImpl.deleteStudentById(id);
    }

    public void updateStudent(Student student) {
        this.fakeStudentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.fakeStudentDaoImpl.insertStudent(student);
    }
}
