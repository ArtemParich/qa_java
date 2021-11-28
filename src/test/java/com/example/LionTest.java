package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensEqualsOne() throws Exception {
        Lion lion = new Lion ("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(actual, expected);
    }

    @Test
    public void getFoodEqualsPredator() throws Exception {
        Lion lion = new Lion ("Самец", feline);
        List<String> expected = List.of("Хищник");
        List<String> actual = lion.getFood();
        assertNotEquals(actual, expected);
    }

    @Test
    public void testExceptionIncorrectChoiceSex() {
        try {
            Lion lion = new Lion("Сам", feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}