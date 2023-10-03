package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextCurrentRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = this.currentRadioStation + 1;
            return;
        }
        currentRadioStation = 0;
    }

    public void setPrevCurrentRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = this.currentRadioStation - 1;
            return;
        }
        currentRadioStation = 9;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

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
