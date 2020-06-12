package com.example.springbootquickstart.courseapi.Repository;

import com.example.springbootquickstart.courseapi.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepo extends CrudRepository <Course,String> {

    public List<Course> findByTopicId(String topicId);

}
