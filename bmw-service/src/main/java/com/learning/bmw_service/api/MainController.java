package com.learning.bmw_service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/contactDetails/{optionType}")
    public ContactDetails getNextServiceSlot(@PathVariable String optionType){

        if(optionType.equalsIgnoreCase("service"))
            return new ContactDetails(
                    "Jatin Automobiles",
                    "Shop 12, Eon Plaza, Bankmore, Dhanbad",
                    "8411996111");
        else if(optionType.equalsIgnoreCase("accessories"))
            return new ContactDetails(
                    "Car Decor",
                    "Shop 16, Saraidhela Main Road, new SBI Branch, Dhanbad",
                    "8411900000");
        else if(optionType.equalsIgnoreCase("bodyShop"))
            return new ContactDetails(
                    "Pulkit Body works",
                    "ISM Campus Dhanbad",
                    "8411996222");

        return null;
    }
}
