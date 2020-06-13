package com.example.simplecaching.service;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service("cacheService")
public class CacheService {

    private static Map<String,String> cacheMap = new HashMap<>();

    @PostConstruct
    public void populateCache(){
        //you can populate from any source, i am populating it with some static values
        cacheMap.put("A","Apple");
        cacheMap.put("B","Ball");
    }

    public Map<String, String> getStaticValues() {
        return cacheMap;
    }

    public Map<String, String> setStaticValues(Map<String, String> request) {
        if(!CollectionUtils.isEmpty(request)){
            cacheMap.putAll(request);
        }
        return cacheMap;
    }
}
