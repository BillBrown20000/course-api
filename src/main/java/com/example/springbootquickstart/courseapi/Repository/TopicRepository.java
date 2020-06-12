package com.example.springbootquickstart.courseapi.Repository;

import com.example.springbootquickstart.courseapi.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository <Topic, String> {



}
