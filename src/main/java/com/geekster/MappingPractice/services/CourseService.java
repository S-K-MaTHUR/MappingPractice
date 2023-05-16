package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.repositories.I_Course_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    I_Course_Repo courseRepo;
    public String addCourse(Course course) {
        courseRepo.save(course);
        return "Courses are added successfully...!!!!";
    }

    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public Course getCourse(String id) {
        return courseRepo.findById(id).get();
    }

    public String updateCourse(String id, Course course) {
        courseRepo.save(course);
        return "Courses are updated";
    }

    public String deleteCourse(String id) {
        courseRepo.deleteById(id);
        return "Course deleted..";
    }
}
