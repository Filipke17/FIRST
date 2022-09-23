package com.example.demo.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GitHubAdapter {
    public int getCount() {
        String request = "https://api.github.com/search/issues?q=windows+label:bug+language:python+state:open&sort=created&order=asc";

        RestTemplate restTemplate = new RestTemplate();


        ResponseEntity<String> response
                = restTemplate.getForEntity(request, String.class);

        return response.getBody().length();
    }
}
