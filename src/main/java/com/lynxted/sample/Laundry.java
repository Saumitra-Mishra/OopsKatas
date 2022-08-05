package com.lynxted.sample;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class Laundry {
    private final List<LaundryElement> laundryElementList;

    public Laundry(List<LaundryElement> laundryElementList) {
        this.laundryElementList = laundryElementList;
    }

    static Laundry of(List<LaundryElement> allLaundry) {
        return new Laundry(allLaundry);
    }

    List<LaundryElement> asList() {
        return unmodifiableList(laundryElementList);
    }

    Laundry with(LaundryElement newLaundryElement) {
        List<LaundryElement> updatedLaundry = new ArrayList<>(laundryElementList);
        updatedLaundry.add(newLaundryElement);
        return Laundry.of(updatedLaundry);
    }

    Laundry withOut(List<LaundryElement> removedElements) {
        List<LaundryElement> updatedLaundry = new ArrayList<>(laundryElementList);
        updatedLaundry.removeAll(removedElements);
        return Laundry.of(updatedLaundry);
    }
}
