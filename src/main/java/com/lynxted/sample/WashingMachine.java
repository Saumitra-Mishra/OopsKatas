package com.lynxted.sample;

import java.util.Collection;

public class WashingMachine {

    private Programme programme;
    private Laundry laundry;

    void selectProgramme(Programme programme) {
        this.programme = programme;
    }

    Laundry takeOutLaundry() {
        return laundry;
    }

    void addLaundry(Laundry laundry) {
        this.laundry = laundry;
    }

    void start() {
        laundry.asList().forEach(LaundryElement::clean);
    }
}
