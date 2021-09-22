package ru.netology;




public class RadioMan {
    private int id;
    private int currentRadio;
    private int currentVolume;
    private int minRadio = 0;
    private int maxRadio = 9;
    private int minVolume = 0;
    private int maxVolume = 100;


    public RadioMan(int id, int minRadio, int maxRadio, int minVolume, int maxVolume) {
        this.id = id;
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public RadioMan() {

    }

    public void setCurrentRadio(int newRadio) {

        if (newRadio < minRadio) {
            return;
        }
        if (newRadio > maxRadio) {
            return;
        }
        currentRadio = newRadio;

    }

    public void nextStation() {

        int nextStation = currentRadio + 1;


        if (nextStation > maxRadio) {
            currentRadio = minRadio;
        } else {
            currentRadio = nextStation - 1;
        }

    }

    public void beforeStation() {

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

        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;

    }

    public void nextVolume() {

        int nextVolume = currentVolume + 1;
        int v = currentVolume + 1;

        if (v > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = nextVolume - 1;
        }

    }

    public void beforeVolume() {

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


