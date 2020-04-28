package ru.netology.jupiter;

import org.junit.jupiter.api.Test;
import ru.netology.service.Service;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTestJupiter {
    @Test
    public void shouldService100() {
        Service service = new Service();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldService0() {
        Service service = new Service();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}