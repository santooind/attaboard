package com.example.attaboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnboardController {

    @GetMapping("/register")
    User registerUser(){
        User user=new User();
        user.setSubscriberId(12345678);
        user.setFirstName("Santhoshkumar");
        user.setLastName("Sivaji");
        return user;
    }
}
