package com.hedefibul.consumer.listener;

import com.hedefibul.consumer.model.Sensor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    /*
    @KafkaListener(topics = "Konumlar", group = "group_id",
            containerFactory = "sensorKafkaListenerFactory")
    public void consumeMessage(Sensor sensor) {
        System.out.println("Sensor: " + sensor);
    }
    */

    @KafkaListener(topics = "Locations", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "Locations_json", group = "group_json",
            containerFactory = "sensorKafkaListenerFactory")
    public void consumeJson(Sensor sensor) {
        System.out.println("Consumed JSON Message: " + sensor);
        System.out.println(sensor.getName());
        System.out.println(sensor.getPositionX());
        System.out.println(sensor.getPositionY());
    }
}