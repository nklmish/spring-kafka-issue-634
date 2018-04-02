package com.nklmish.springkafkaissue.kafkautilsexception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EmbeddedKafka(topics = {"testSeekConsumerWithNullToken",
		"testSeekConsumerWithAnEmptyToken",
		"testSeekConsumerWithAnExistingToken"}, count = 3, partitions = 5)
public class KafkaUtilsExceptionApplicationTests {

	@Autowired
	private KafkaEmbedded kafka;

	@Test
	public void contextLoads() {

	}

}
