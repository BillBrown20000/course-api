package com.example.springbootquickstart.courseapi.Service;

import com.example.springbootquickstart.courseapi.model.Topic;
import com.example.springbootquickstart.courseapi.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>( Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java","Core Java", "Java Description"),
                new Topic("javascript", "Javascript","Java Description")
        ));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id){
//        return topics.stream().filter
//                (topic -> topic.getId().equals(id))
//                .findFirst().get();
        return topicRepository.findById(id);
    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }
    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }
}
