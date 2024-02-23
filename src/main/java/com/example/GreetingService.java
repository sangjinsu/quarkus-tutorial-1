package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.resteasy.reactive.RestQuery;

@ApplicationScoped
public class GreetingService {

    public String hello(@RestQuery String name) {
        return "Hello " + name;
    }

}
