package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;


class TempClassTest {


    private TempClass tempClass = new TempClass();

    @Test
    public void testMultiplyByTwo() {
        int expected = 4;
        int actual = tempClass.multiplyByTwo(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyByThree() {
        int expected = 6;
        int actual = tempClass.multiplyByThree(2);
        assertEquals(expected, actual);
    }

}