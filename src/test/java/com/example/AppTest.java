package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        assertEquals(40, App.add(15, 25));
    }
}