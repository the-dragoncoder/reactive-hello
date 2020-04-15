package com.spolyzon.reactive.reactivehello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dragoncoder")
public class SimpleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleController.class);

    @GetMapping
    public ResponseEntity<String> getResponse(ServerHttpRequest request) {
        LOGGER.info("Dragon Coder received a request!!!");

        return ResponseEntity.ok("{\"test\":\"success\"}");
    }
}
