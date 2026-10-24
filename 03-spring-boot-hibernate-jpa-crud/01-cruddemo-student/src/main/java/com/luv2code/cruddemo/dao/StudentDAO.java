package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

public interface StudentDAO {

    public void save(Student TheStudent);
    public Student findStudentById(int theId);
//    public void update(Student TheStudent);
//    public void delete(int id);
}
