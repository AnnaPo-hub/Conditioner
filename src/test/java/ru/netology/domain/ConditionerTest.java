package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {


    @Test
    void shouldIncreaseCurrentTemperatureInNormalCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    @Test

    void shouldIncreaseCurrentTemperatureInHeatCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperatureInUsualConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test

    void shouldDecreaseCurrentTemperatureInColdConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(-15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-15, conditioner.getCurrentTemperature());
    }


//    @Test
//    void getMaxTemperature() {
//        Conditioner conditioner = new Conditioner();
//        assertEquals(32, conditioner.getMaxTemperature());
//
//    }
//
//
//    @Test
//    void getMinTemperature() {
//        Conditioner conditioner = new Conditioner();
//        assertEquals(18, conditioner.getMinTemperature());
//    }
//
//
//    @Test
//    void getCurrentTemperature() {
//        Conditioner conditioner = new Conditioner();
//        assertEquals(22, conditioner.getCurrentTemperature());
//    }
//
//    @Test
//    void setCurrentTemperature() {
//        Conditioner conditioner = new Conditioner();
//        conditioner.setCurrentTemperature(24);
//        assertEquals(24, conditioner.getCurrentTemperature());
//    }
//
//
//    @Test
//    void shouldBeOn() {
//        Conditioner conditioner = new Conditioner();
//        conditioner.setOn(true);
//        assertTrue(conditioner.isOn());
//    }
//
//    @Test
//    void shouldBeOff() {
//        Conditioner conditioner = new Conditioner();
//        conditioner.setOn(false);
//        assertFalse(conditioner.isOn());
//    }


}


