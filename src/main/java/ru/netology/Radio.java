package ru.netology;

public class Radio {

    public int idStation;
    public int getIdStation() {
        return idStation;
    }
    public void setIdStation(int newIdStation) {
        if (newIdStation < 0) {
            return;
        }
        if (newIdStation > 9) {
            return;
        }
        idStation = newIdStation;
    }
    public void next() {
        idStation = idStation + 1;
        if (idStation > 9) {
            idStation = 0;
        }
    }
    public void prev() {
        idStation = idStation - 1;
        if (idStation < 0) {
            idStation = 9;
        }
    }

    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
