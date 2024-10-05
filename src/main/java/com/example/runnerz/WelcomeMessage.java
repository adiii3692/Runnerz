package com.example.runnerz;
import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage(){
        return "I'm at home for the weekend";
    }
}
