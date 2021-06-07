package com.hedefibul.consumer.listener;

import com.hedefibul.consumer.model.Sensor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class KafkaConsumer {

    public static double[] generateEquation(double degree, double x1, double y1) {

        double[] result = new double[2];

        double radian = Math.toRadians(90 - degree);
        double m = Math.tan(radian);
        double y = -(m * x1) + y1;

        result[0] = m;
        result[1] = y;


        return result;
    }

    public static double[] calculateIntersectionPoints(double[] result1, double[] result2) {
        double[] result = new double[2];

        double x = (result1[1] - result2[1]) / (result2[0] - result1[0]);
        double y = (result1[0] * x + result1[1]);

        result[0] = x;
        result[1] = y;

        return result;
    }

    @KafkaListener(topics = "Location", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "Location_json", group = "group_json",
            containerFactory = "sensorKafkaListenerFactory")
    public void consumeJson(Sensor sensor) {
        double[] eq1 = null;
        double[] eq2 = null;


        System.out.println("Consumed JSON Message: " + sensor);
        System.out.println("Sensor Name: " + sensor.getName1());
        System.out.println("X1: " + sensor.getPositionX1());
        System.out.println("Y1: " + sensor.getPositionY1());
        System.out.println("Bearing Angle1:" + sensor.getBearingAngle1());
        System.out.println("----------------------------------------------");
        System.out.println("Sensor Name: " + sensor.getName2());
        System.out.println("X2: " + sensor.getPositionX2());
        System.out.println("Y2: " + sensor.getPositionY2());
        System.out.println("Bearing Angle2:" + sensor.getBearingAngle2());

        eq1 = generateEquation(sensor.getBearingAngle1(), sensor.getPositionX1(), sensor.getPositionY1());
        eq2 = generateEquation(sensor.getBearingAngle2(), sensor.getPositionX2(), sensor.getPositionY2());

        double[] calculatedPoints = calculateIntersectionPoints(eq1, eq2);

        System.out.println("Target X: " + calculatedPoints[0]);
        System.out.println("Target Y: " + calculatedPoints[1]);

    }

}



