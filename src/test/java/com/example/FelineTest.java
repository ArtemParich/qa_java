package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

   @Test
    public void eatMeatEqualsPredator() throws Exception {
        Feline feline = new Feline();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(actual, expected);
    }

    @Test
    public void getFamilyEqualsFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(actual, expected);
    }

    @Test
    public void getKittensEqualsOne() {
        Feline feline = new Feline();

        int actual = feline.getKittens();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void getKittensReturnEqualsFive() {
        Feline feline = new Feline();

        int expected = 5;
        int actual = feline.getKittens(expected);

        assertEquals(actual, expected);
    }
}