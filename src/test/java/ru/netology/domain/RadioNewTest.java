package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioNewTest {
    Radio radio = new Radio();

//    @Test
//    public void shouldCheckSettingStationQuantity(){
//        radio.setMaxRadioStation(0);
//        assertEquals(10, radio.getMaxRadioStation());
//    }

    @Test
    void shouldChangeTheStationByRemoteControl() {
        assertEquals(8, radio.changeTheStationByRemoteControl(8));
    }

    @Test
    void shouldChangeTheStationByRemoteControlIfNewStationQuantityWasSet() {
        radio.setMaxRadioStation(12);
        assertEquals(12, radio.changeTheStationByRemoteControl(12));
    }

    @Test
    void shouldChangeTheStationByButtonNextIfCurrentIsNew() {
        radio.setMaxRadioStation(12);
        radio.setCurrentRadioStation(12);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonNext() {
        Radio radio = new Radio();
        radio.changeTheStationByNextButton();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonIfCurrentIsNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.changeTheStationByPrevButton();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        Radio radio = new Radio();
        radio.changeTheStationByPrevButton();
        assertEquals(4, radio.getCurrentRadioStation());
    }
}
