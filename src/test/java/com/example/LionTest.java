package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensEqualsZero() throws Exception {
        Lion lion = new Lion ("Самка", feline);
        int expected = 0;
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