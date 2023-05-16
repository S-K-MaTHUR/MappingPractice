package com.geekster.MappingPractice.repositories;


import com.geekster.MappingPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IStudentRepo extends JpaRepository<Student,String> {
}
