package ru.netology.domain;

public class RadioAdvanced {

    private int currentVolume = 5;
    private int currentRadioStation = 9;

    public int changeTheStationByRemoteControl(int intendedStation) {
        currentRadioStation = intendedStation;
        return currentRadioStation;
    }

    public int changeTheStationByNextButton() {
        if (currentRadioStation == 9) {
            return currentRadioStation = 0;
        } else {
            currentRadioStation += 1;
            return currentRadioStation;
        }
    }

    public int changeTheStationByPrevButton() {
        if (currentRadioStation == 0) {
            return currentRadioStation = 9;
        } else {
            currentRadioStation -= 1;
            return currentRadioStation;
        }
    }


    public int increaseVolume() {
        int maxVolume = 10;
        if (currentVolume >= maxVolume) {
            return maxVolume;
        } else {
            currentVolume += 1;
            return currentVolume;
        }
    }

    public int decreaseVolume() {
        int minVolume = 0;
        if (currentVolume <= minVolume) {
            return minVolume;
        } else {
            currentVolume -= 1;
            return currentVolume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }
}
