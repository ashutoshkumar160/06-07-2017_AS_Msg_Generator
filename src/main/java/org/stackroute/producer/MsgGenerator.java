package org.stackroute.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.stackroute.model.Car;

public class MsgGenerator {

	private static final Logger LOGGER = LoggerFactory.getLogger(MsgGenerator.class);

	@Value("${topic.json}")
	private String jsonTopic;

	@Autowired
	private KafkaTemplate<String, Car> temp;

	public void sendMsg(Car car) {
		LOGGER.info("sending car='{}'", car/* .toString() */);
		temp.send(jsonTopic, car);
	}
}
