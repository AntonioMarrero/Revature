package com.revature.kafka.consumer;

import java.util.concurrent.CountDownLatch;

import javax.sound.midi.Receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Reciever {
	
	private static final Logger LOGGER =
		      LoggerFactory.getLogger(Receiver.class);

		  private CountDownLatch latch = new CountDownLatch(1);

		  public CountDownLatch getLatch() {
		    return latch;
		  }

		  @KafkaListener(topics = "${kafka.topic.helloworld}")
		  public void receive(String payload) {
		    LOGGER.info("received payload='{}'", payload);
		    latch.countDown();
		  }

}