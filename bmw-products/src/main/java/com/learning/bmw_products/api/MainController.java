package com.learning.bmw_products.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/car/{carId}")
    public CarDetails getCarDetails(@PathVariable String carId){

        if(carId.equalsIgnoreCase("340i"))
            return new CarDetails("INR 75 Lac", "1999 CC");
        else if(carId.equalsIgnoreCase("540i"))
            return new CarDetails("INR 1.2 cr", "2499 CC");
        else if(carId.equalsIgnoreCase("740i"))
            return new CarDetails("INR 2.4 cr", "2999 CC");

        return new CarDetails();
    }
}
