package com.sst.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sst.model.Topics;

@Service
public class TopicServices {
	List<Topics> topics = Arrays.asList(new Topics(101, "Data Structure", "About data"),
			new Topics(102, "Software", "About software"));

	public List<Topics> getAllTopics() {

		return topics;
	}
}
