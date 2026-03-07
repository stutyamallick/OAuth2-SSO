package com.learning.bmw_service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/nextSlot/{carId}")
    public String getNextServiceSlot(@PathVariable String carId){

        if(carId.equalsIgnoreCase("340i"))
            return "Tomorrow 9AM onwards";
        else if(carId.equalsIgnoreCase("540i"))
            return "Day after tomorrow 12PM onwards";
        else if(carId.equalsIgnoreCase("740i"))
            return "Tomorrow 11AM onwards";

        return "No Available slots right now!";
    }
}
