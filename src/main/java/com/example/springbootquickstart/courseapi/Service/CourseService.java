package com.example.springbootquickstart.courseapi.Service;

import com.example.springbootquickstart.courseapi.Repository.CourseRepo;
import com.example.springbootquickstart.courseapi.model.Course;
import com.example.springbootquickstart.courseapi.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepo.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id){
        return courseRepo.findById(id);
    }
    public void addCourse(Course course){
        courseRepo.save(course);
    }

    public void updateCourse(Course course) {
        courseRepo.save(course);
    }
    public void deleteCourse(String id){
        courseRepo.deleteById(id);
    }
}
