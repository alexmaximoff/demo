package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "TelegramRestClient", url = "https://api.telegram.org/bot1316251543:AAEYIhcMgLridnx5_j0tk2dTHE4fsjwlzDU")
public interface TelegramRestClient {
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/getMe",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<Map> getMe();
}
