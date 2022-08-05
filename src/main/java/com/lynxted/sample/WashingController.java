package com.lynxted.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

class WashingController {

    private final WashingService washingService;

    WashingController(WashingService washingService) {
        this.washingService = washingService;
    }

    private Collection<LaundryElement> getAllLaundry() {
        Collection<LaundryElement> allLaundry = new ArrayList<>();
        // fill the allLaundry collection with available laundry by any way, e.g. obtaining it from repositories, providers, services
        return allLaundry;
    }

    private Integer getRequestedSpinSpeed() {
        return new Random().nextInt(1200);
    }

    private Integer getRequestedTemperature() {
        return new Random().nextInt(95);
    }

}
