package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

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
    public void getFoodEqualsList() throws Exception {
        Cat cat = new Cat(feline);

        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птица", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птица", "Рыба");
        assertEquals(expected, actual);
 }
}