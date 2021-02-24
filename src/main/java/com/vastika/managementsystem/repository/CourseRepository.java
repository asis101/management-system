package com.vastika.managementsystem.repository;

import com.vastika.managementsystem.model.Course;

import java.util.List;

public interface CourseRepository {

    void saveCourse(Course course);

    void updateCourse(Course course);

    void deleteCourse(int id);

    Course getCourseById(int id);

    List<Course> getAllCourse();

}
