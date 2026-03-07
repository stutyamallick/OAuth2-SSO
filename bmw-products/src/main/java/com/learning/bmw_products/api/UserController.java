package com.learning.bmw_products.api;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user-info")
    public String userInfo(Authentication authentication){

        return authentication != null ? authentication.getName() : "NOT_FOUND";
    }
}
