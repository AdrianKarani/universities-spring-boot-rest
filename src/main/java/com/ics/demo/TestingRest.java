package com.ics.demo;

import com.ics.demo.models.University;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//@Component
public class TestingRest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<University>> response = restTemplate.exchange(
                "http://10.51.10.111:9090/universities",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<University>>() {
                });
        List<University> universities = response.getBody();
        System.out.println("Response:" + universities.toString());

        University university = restTemplate.getForObject(
                "http://10.51.10.111:9090/universities/1",
                University.class
        );


    }
}
