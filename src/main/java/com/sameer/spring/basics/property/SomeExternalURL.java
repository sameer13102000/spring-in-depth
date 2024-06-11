package com.sameer.spring.basics.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalURL {
    @Value("${external.url}")
    private String url;

    public String getURL(){
        return url;
    }
}
