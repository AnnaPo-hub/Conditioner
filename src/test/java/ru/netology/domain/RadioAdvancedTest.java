package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    void changeTheStationByRemoteControl() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(8, radio.changeTheStationByRemoteControl(8));
    }

    @Test
    void changeTheStationByButtonNextIfCurrentIsNine() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.changeTheStationByNextButton());
    }

    @Test
    void changeTheStationByButtonNext() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentRadioStation(4);
        assertEquals(5, radio.changeTheStationByNextButton());
    }

    @Test
    void changeTheStationByPrevButtonIfCurrentIsNull() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentRadioStation(0);
        assertEquals(9, radio.changeTheStationByPrevButton());
    }

    @Test
    void changeTheStationByPrevButton() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(8, radio.changeTheStationByPrevButton());
    }


//    public int increaseVolume() {
//        if (currentVolume >= maxVolume) {
//            return maxVolume;
//        } else {
//            currentVolume += 1;
//            return currentVolume;}
//    }

    @Test
    void increaseVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(6, radio.increaseVolume());
    }

    @Test
    void increaseVolume1() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.increaseVolume());
    }

    @Test
    void decreaseVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(4, radio.decreaseVolume());
    }


    @Test
// to review
    void decreaseVolumeLessThanMinimun() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.decreaseVolume());
    }

    @Test
    void getCurrentVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(2);
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(2);
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void getCurrentRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentRadioStation(2);
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentRadioStation(2);
        assertEquals(2, radio.getCurrentRadioStation());
    }
}