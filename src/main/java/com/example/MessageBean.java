package com.example;

import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class MessageBean {

    public String getMessage() {
        return "Todo was added at " + LocalTime.now();
    }
}
