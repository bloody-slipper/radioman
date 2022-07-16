package Radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10 && currentVolume >= 0) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0 && currentVolume <= 10) {
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
        } else if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public void setRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 9;
        }

        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }
}
