public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void maxVolume() {
        currentVolume = 10;
    }

    public void minVolume() {
        currentVolume = 0;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public int setRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
        int x = 0;
        if (x >= 0 && x <= 9) {
            return x;
        }
        return currentRadioStation;
    }
}
