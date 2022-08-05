package com.lynxted.sample;

public class Programme {
    private final Integer temperature;
    private final Integer spinSpeed;

    Programme(Integer temperature, Integer spinSpeed) {
        this.temperature = temperature;
        this.spinSpeed = spinSpeed;
    }

    Integer getTemperature() {
        return temperature;
    }

    Integer getSpinSpeed() {
        return spinSpeed;
    }
}
