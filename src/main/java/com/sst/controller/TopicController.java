package com.sst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sst.model.Topics;
import com.sst.services.TopicServices;

@RestController
public class TopicController {
	@Autowired
	private TopicServices topicServices;

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return topicServices.getAllTopics();
	}
}
