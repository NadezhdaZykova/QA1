package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldUnder1000 (){
        assertEquals(cashbackHackService.remain(750), 250);
    }

    @Test
    public void shouldBelow1000(){
        assertEquals(cashbackHackService.remain(5100), 900);
    }

    @Test
    public  void should0(){
        assertEquals(cashbackHackService.remain(0), 1000);
    }


}