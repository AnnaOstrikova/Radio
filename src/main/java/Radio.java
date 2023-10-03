package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;
    private int minRadioStation;
    private int minVolume;
    private int maxVolume;


    public Radio() {
        this.maxRadioStation = 9;
        this.minRadioStation = 0;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public Radio(int quantity) {
        this.maxRadioStation = quantity - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > this.maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < this.minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextCurrentRadioStation() {
        if (currentRadioStation < this.maxRadioStation) {
            currentRadioStation = this.currentRadioStation + 1;
            return;
        }
        currentRadioStation = this.minRadioStation;
    }

    public void setPrevCurrentRadioStation() {
        if (currentRadioStation > this.minRadioStation) {
            currentRadioStation = this.currentRadioStation - 1;
            return;
        }
        currentRadioStation = this.maxRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }gi

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = this.currentVolume + 1;
            return;
        }
        currentVolume = 100;
    }

    public void setReduceVolume() {
        if (currentVolume > 0) {
            currentVolume = this.currentVolume - 1;
            return;
        }
        currentVolume = 0;
    }
}
