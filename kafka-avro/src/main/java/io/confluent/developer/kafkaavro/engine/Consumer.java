package io.confluent.developer.kafkaavro.engine;

import io.confluent.developer.Album;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@CommonsLog(topic = "Consumer Logger")
public class Consumer {

    @Value("${topic.name}")
    private String COPNTOPIC;

    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void readMessage(ConsumerRecord<String, Album> record) {
        log.info(String.format("Consumed message -> %s", record.value()));
        String Artist = record.value().getArtist();
        //String Isn = record.value().getIsn();
       // String Release = record.value().getRelease();
        log.info(Artist +" : " );
    }

}

