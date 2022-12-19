package com.revature;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class timeTest {

	@Test
    public void testHandsOfTime1() {

        handsOfTime handsOfTime = new handsOfTime();
        //same position
        assertEquals(0, handsOfTime.getAngle(LocalTime.of(0, 0)));
    }


    @Test
    public void testHandsOfTime2() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(0, handsOfTime.getAngle(LocalTime.of(6, 30)));
    }

    @Test
    public void testHandsOfTime3() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(0, handsOfTime.getAngle(LocalTime.of(6, 30)));
    }

@Test
    public void testHandsOfTime4() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(90, handsOfTime.getAngle(LocalTime.of(0, 15)));
    }
    @Test
    public void testHandsOfTime5() {
        handsOfTime handsOfTime = new handsOfTime();
//        assertEquals(90, handsOfTime.getAngle(LocalTime.of(0, 15)));
        assertEquals(6, handsOfTime.getAngle(LocalTime.of(3, 16)));

    }    @Test
    public void testHandsOfTime6() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(60, handsOfTime.getAngle(LocalTime.of(4, 30)));
    }

    @Test
    public void testHandsOfTime7() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(90, handsOfTime.getAngle(LocalTime.of(6, 15)));
    }
@Test
    public void testHandsOfTime8() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(90, handsOfTime.getAngle(LocalTime.of(0, 15)));
    }

    @Test
    public void testHandsOfTime9() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(108, handsOfTime.getAngle(LocalTime.of(9, 27)));
    }

    @Test
    public void testHandsOfTime10() {
        handsOfTime handsOfTime = new handsOfTime();
        assertEquals(36, handsOfTime.getAngle(LocalTime.of(1, 59)));
    }

}
