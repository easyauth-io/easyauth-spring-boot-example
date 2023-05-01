package com.easyauth.easyAuthExample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
public class UserRestController {
    WebClient webClient;

    public UserRestController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/")
    public String index() {
        return "index page";
    }

    @GetMapping("/profile")
    public String profile(@RegisteredOAuth2AuthorizedClient("easyauth") OAuth2AuthorizedClient authorizedClient,
                          @Value("${easyauth.config.baseuri}") String baseUri) {
        String resourceUri = baseUri + "/tenantbackend/api/profile";
        return webClient
                .get()
                .uri(resourceUri)
                .attributes(oauth2AuthorizedClient(authorizedClient))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
