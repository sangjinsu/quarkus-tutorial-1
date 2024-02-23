package com.example;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;


class GreetingServiceTest {

    @Test
    public void testHelloEndPoint() {
        given().when()
                .get("/hello")
                .then()
                .statusCode(200)
                .body(containsString("Hello"));
    }


    @Test
    public void testGreetingEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("name", uuid)
                .when().get("/hello/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("hello " + uuid));
    }
}