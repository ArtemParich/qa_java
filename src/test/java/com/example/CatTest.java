package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundEqualsMew() {
        Cat cat = new Cat(feline);

        String actualSound = cat.getSound();
        String expectedSound = "Мяу";

        assertEquals(actualSound, expectedSound);
    }

    @Test
    public void getSoundNoEqualsMewMew() {
        Cat cat = new Cat(feline);

        String actualSound = cat.getSound();
        String expectedSound = "МяуМяу";

        assertNotEquals (actualSound, expectedSound);
    }

    @Test
    public void getFoodException() {
        Cat cat = new Cat(feline);

        try {
            cat.getFood();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}