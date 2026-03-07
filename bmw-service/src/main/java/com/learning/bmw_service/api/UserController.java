package com.learning.bmw_service.api;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user-info")
    public UserInfo userInfo(Authentication authentication){

        return new UserInfo(authentication.getName());
    }
}
