package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldUnder1000 () {
        assertEquals(cashbackHackService.remain(450), 550);
    }

    @Test
    public void shouldBelow1000 () {
        assertEquals(cashbackHackService.remain(5100), 900);
    }

    @Test
    public void should0() {
        assertEquals(cashbackHackService.remain(1000), 0);
    }


}