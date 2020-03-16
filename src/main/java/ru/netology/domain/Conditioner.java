package ru.netology.domain;

public class Conditioner {
    private int maxTemperature = 32;
    private int minTemperature = 18;
    private int currentTemperature = 22;
    private boolean on;

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        } else {
            currentTemperature += 1;
        }
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        } else {
            currentTemperature -= 1;
        }
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
