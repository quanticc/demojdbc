package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
class DemoApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void contextLoads() {
        Movie movie = new Movie(null, "Matrix", "Cool",
                new Rental(Duration.ofDays(2), 100));

        Movie result = movieRepository.save(movie);

        log.info("{}", result);
    }

}
