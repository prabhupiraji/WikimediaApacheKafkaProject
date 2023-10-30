package com.kafka;

import org.Kafka.wikimedia.producer.wikimediachangesproducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaWikimediaProjectApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(KafkaWikimediaProjectApplication.class, args);
	}
      @Autowired
	wikimediachangesproducer wikimediachagesproducer;
      
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		wikimediachagesproducer.sendMessage();
		
	}

	
}
