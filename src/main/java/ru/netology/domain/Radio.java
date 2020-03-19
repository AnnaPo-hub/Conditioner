package ru.netology.domain;

import lombok.Data;

@Data


public class Radio {


    private int currentVolume = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioStation = 5;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;


    public int changeTheStationByRemoteControl(int intendedStation) {
        if (intendedStation >= 0) {
            currentRadioStation = intendedStation;
        }
        return currentRadioStation;
    }


    public void changeTheStationByNextButton() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation += 1;
        }
    }

    public void changeTheStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation -= 1;
        }
    }


    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;

        }
    }


    public Radio() {
    }

    public Radio(int currentRadioStation, int maxRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(int currentVolume, int maxVolume, int minVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }


}
