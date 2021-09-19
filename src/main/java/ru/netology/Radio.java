package ru.netology;

public class Radio {
    private int currentRadio;
    private int currentVolume;


    public void setCurrentRadio(int newRadio) {
        int minRadio = 0;
        int maxRadio = 9;
        if (newRadio < minRadio) {
            return;
        }
        if (newRadio > maxRadio) {
            return;
        }
        currentRadio = newRadio;

    }

    public void nextStation() {
        int minRadio = 0;
        int maxRadio = 9;
        int nextStation = currentRadio + 1;


        if (nextStation > maxRadio) {
            currentRadio = minRadio;
        } else {
            currentRadio = nextStation - 1;
        }

    }

    public void beforeStation() {
        int minRadio = 0;
        int maxRadio = 9;
        int beforeStation = currentRadio;
        int r = currentRadio - 1;
        if (r < minRadio) {
            currentRadio = maxRadio;
        } else {
            currentRadio = beforeStation;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentVolume(int newVolume) {
        int minVolume = 0;
        int maxVolume = 10;
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;

    }

    public void nextVolume() {
        int minVolume = 0;
        int maxVolume = 10;
        int nextVolume = currentVolume + 1;
        int v = currentVolume + 1;

        if (v > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = nextVolume - 1;
        }

    }

    public void beforeVolume() {
        int minVolume = 0;
        int maxVolume = 10;
        int beforeVolume = currentVolume - 1;
        int v = currentVolume - 1;
        if (v < minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = beforeVolume + 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

}

