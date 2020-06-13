package com.example.simplecaching.controller;

import com.example.simplecaching.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CacheController {

    @Autowired
    CacheService cacheService;

    @GetMapping("/staticvalues")
    public Map<String,String> getStaticValues(){
        return cacheService.getStaticValues();
    }

    @PostMapping("/staticvalues")
    public Map<String,String> getStaticValues(@RequestBody Map<String,String> request){
        return cacheService.setStaticValues(request);
    }
}
