package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("SmLabbot")
public class SmLabbot {

    @Autowired
    private TelegramRestClient client;

//    @GetMapping(path = "/getme")
    public ResponseEntity<Map> getme(){
        return ResponseEntity.ok(client.getMe().getBody());
    }
}
