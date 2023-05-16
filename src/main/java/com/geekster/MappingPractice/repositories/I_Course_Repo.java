package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface I_Course_Repo extends JpaRepository<Course,String> {
}
