package com.lynxted.sample;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public class Basket {
    private Laundry laundry;

    private Basket(Laundry laundry) {
        this.laundry = laundry;
    }

    static Basket empty() {
        return new Basket(Laundry.of(emptyList()));
    }

    void put(LaundryElement laundryElement) {
        laundry = laundry.with(laundryElement);
    }

    Laundry takeOutWool() {
        List<LaundryElement> woolElements = laundryOf(LaundryElement.WoolLaundryElement.class);
        laundry = laundry.withOut(woolElements);
        return Laundry.of(woolElements);
    }

    Laundry takeOutCotton() {
        List<LaundryElement> cottonElements = laundryOf(LaundryElement.CottonLaundryElement.class);
        laundry = laundry.withOut(cottonElements);
        return Laundry.of(cottonElements);
    }

    Laundry takeOutSilk() {
        List<LaundryElement> silkElements = laundryOf(LaundryElement.SilkLaundryElement.class);
        laundry = laundry.withOut(silkElements);
        return Laundry.of(silkElements);
    }

    private List<LaundryElement> laundryOf(Class<? extends LaundryElement> elementType) {
        return laundry.asList().stream().filter(elementType::isInstance).collect(toList());
    }
}
