package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    void testFactorialNegativeInput(){
        assertThrows(IllegalArgumentException.class, () -> {Main.factorial(-4);});
    }

    @Test
    void testFactorialOfZero(){
        assertEquals(1, Main.factorial(0));
    }

    @Test
    void testFactorialOfFive(){
        assertEquals(120, Main.factorial(5));
    }

    @Test
    void testNegativeInputFibonacci(){
        assertThrows(IllegalArgumentException.class, () -> {Main.fibonacci(-4);});
    }

    @Test
    void testFibonacciOfZero(){
        assertEquals(0, Main.fibonacci(0));
    }

    @Test
    void testFibonacciOfOne(){
        assertEquals(1, Main.fibonacci(1));
    }

    @Test
    void testFibonacciOfSix(){
        assertEquals(8, Main.fibonacci(6));
    }





}