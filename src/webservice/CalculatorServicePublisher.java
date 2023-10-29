package webservice;

import javax.xml.ws.Endpoint;

public class CalculatorServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/calculator";
        Calaculator calaculator = new CalculatorImp();
        Endpoint.publish(url, calaculator);
        System.out.println("Calculator service is running at " + url);

    }
}
