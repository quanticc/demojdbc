package com.example.demo;

import java.time.Duration;

public class Rental {

    private final Duration duration;
    private final Integer price;

    public Rental(Duration duration, Integer price) {
        this.duration = duration;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "duration=" + duration +
                ", price=" + price +
                '}';
    }
}
