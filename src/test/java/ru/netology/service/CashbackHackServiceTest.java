package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldUnder1000() {
        assertEquals(250, cashbackHackService.remain(750));
    }

    @Test
    public void shouldBelow1000() {
        assertEquals(900, cashbackHackService.remain(5100));
    }

    @Test
    public void should0() {
        assertEquals(0, cashbackHackService.remain(1000));
    }


}