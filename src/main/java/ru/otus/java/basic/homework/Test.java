package ru.otus.java.basic.homework;

import org.junit.jupiter.api.Assertions;

public class Test {
    JavaHomework test = new JavaHomework();

    @org.junit.Test
    public void testNewArrayOneSuccessfully() {
        Assertions.assertArrayEquals(new int[]{2, 3, 4}, test.newArrayOne(new int[]{1, 1, 1, 2, 3, 4}));
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void testNewArrayOneUnsuccessfully() {
        test.newArrayOne(new int[]{3,3,3});
    }

    @org.junit.Test
    public void validArrayTest() {
        Assertions.assertTrue(test.arrCheck(new int[]{1, 2}));
        Assertions.assertFalse(test.arrCheck(new int[]{1, 1}));
        Assertions.assertFalse(test.arrCheck(new int[]{3, 3}));
   }
}