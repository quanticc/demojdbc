package com.example.demo;

import org.springframework.data.annotation.Id;

public class Movie {

    @Id
    private final Long id;
    private final String title;
    private final String description;
    private final Rental rental;

    public Movie(Long id, String title, String description, Rental rental) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rental=" + rental +
                '}';
    }
}
