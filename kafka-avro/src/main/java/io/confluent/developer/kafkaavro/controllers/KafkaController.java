package io.confluent.developer.kafkaavro.controllers;


import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/send")
@CommonsLog(topic = "Controller Logger")
public class KafkaController {


}
