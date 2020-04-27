package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert;
import ru.netology.service.Service;

public class Test {
    @Test
    public void shouldService100() {
        Service service = new Service();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldService200() {
        Service service = new Service();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
