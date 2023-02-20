package com.example.vehicles;

import com.example.vehicles.api.HelloResource;
import jakarta.xml.ws.Endpoint;

public class HelloApplication{
//    private final static String HOST1 = "http://localhost:8085/HelloResource";
    private final static String HOST = "http://localhost:8085/HelloResource";
    public static void main(String[] args) {
//        Endpoint.publish(HOST1,new HelloResource());
        Endpoint.publish(HOST,new HelloResource());
        System.out.println("Endpoint "+ HOST +" published!");
        int a = 3;
    }
}