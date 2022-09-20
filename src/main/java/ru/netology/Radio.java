package ru.netology;

public class Radio {
    private int numbersOfStation = 10;
    private int maxIdStation = 9;
    private int minIdStation = 0;
    private int idStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int numbersOfStation) {
        this.numbersOfStation = numbersOfStation;
        this.maxIdStation = numbersOfStation - 1;
    }

    public Radio() {
    }

    public int getMaxIdStation() {
        return maxIdStation;
    }
    public int getMinIdStation() {
        return minIdStation;
    }
    public int getIdStation() {
        return idStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIdStation(int newIdStation) {
        if (newIdStation < minIdStation) {
            return;
        }
        if (newIdStation > maxIdStation) {
            return;
        }
        idStation = newIdStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        idStation = idStation + 1;
        if (idStation > maxIdStation) {
            idStation = minIdStation;
        }
    }

    public void prev() {
        idStation = idStation - 1;
        if (idStation < minIdStation) {
            idStation = maxIdStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}
