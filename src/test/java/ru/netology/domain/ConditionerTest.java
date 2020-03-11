package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {


    @Test
    void increaseCurrentTemperatureInNormalCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature();
        assertEquals(32, conditioner.getCurrentTemperature());
    }

    @Test
//new
    void increaseCurrentTemperatureInHeatCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureInUsualConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }

    @Test
//new
    void decreaseCurrentTemperatureInColdConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(-15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-15, conditioner.getCurrentTemperature());
    }


    @Test
    void getMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(32, conditioner.getMaxTemperature());


    }

    @Test
    void setMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());

    }

    @Test
    void getMinTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(18, conditioner.getMinTemperature());
    }

    @Test
    void setMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(2);
        assertEquals(2, conditioner.getMinTemperature());


    }

    @Test
    void getCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getCurrentTemperature());
    }


    @Test
    void shouldBeOn() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        assertEquals(true, conditioner.isOn());
    }

    @Test
    void shouldBeOff() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(false);
        assertEquals(false, conditioner.isOn());
    }


}


