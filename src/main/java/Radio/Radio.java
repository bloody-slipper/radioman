package Radio;

public class Radio {
    private int minRadiostation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int size) {
        maxRadioStation = minRadiostation + size;
    }

    public Radio() {
        this.maxRadioStation = 9;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadiostation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadiostation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        } else currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        } else currentVolume--;
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadiostation;
        } else currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadiostation) {
            currentRadioStation = maxRadioStation;
        } else currentRadioStation--;
    }

    public int maxVolume() {
        return maxVolume;
    }

    public int minVolume() {
        return minVolume;
    }
}