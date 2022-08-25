package ru.netology.javaqa;

public class Radio {
    public int currentVolume;
    public int currentStation;
    public int stationAmount;

    public Radio(){
        stationAmount = 10;
    }
    public Radio(int stationAmount) {
        stationAmount = 10;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation(){

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationAmount - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > stationAmount - 1) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 10) {
            currentVolume = currentVolume - 1;
        }
    }
}
