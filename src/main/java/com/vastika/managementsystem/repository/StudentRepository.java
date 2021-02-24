package com.vastika.managementsystem.repository;

import com.vastika.managementsystem.model.Student;

import java.util.List;

public interface StudentRepository {

    void saveStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

    Student getStudentById(int id);

    List<Student> getAllStudent();
}
