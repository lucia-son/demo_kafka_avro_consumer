package io.confluent.developer.kafkaavro;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaAvroConsumerApplication {

	//topic1
	@Value("${topic.name}")
	private String Topic;

	@Value("${topic.partitions}")
	private Integer Partitions;

	@Value("${topic.rf}")
	private short RF;

	// Spring Boot will create a new Kafka topic
	@Bean
	NewTopic Topic() {
		return new NewTopic(Topic, Partitions, RF);
	}

	public static void main(String[] args) {

		SpringApplication.run(KafkaAvroConsumerApplication.class, args);
	}

}
