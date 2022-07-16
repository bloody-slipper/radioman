package Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(8);

        int expexted = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setRadioStation(15);

        int expexted = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldNextRadioStationForMin() {
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.nextRadioStation();

        int expexted = 1;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNextRadioStationForMax() {
        Radio radio = new Radio();

        radio.setRadioStation(9);
        radio.nextRadioStation();

        int expexted = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);


    }

    @Test
    public void shouldNextRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setRadioStation(15);
        radio.nextRadioStation();

        int expexted = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);

    }


    @Test
    public void shouldPrevRadioStationForMin() {
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.prevRadioStation();

        int expexted = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(2);
        radio.prevRadioStation();

        int expexted = 1;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldPrevRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setRadioStation(15);
        radio.prevRadioStation();

        int expexted = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);

    }


    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.maxVolume();

        int expexted = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.minVolume();

        int expexted = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();

        int expexted = 9;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldIncreaseVolumeForMax() {
        Radio radio = new Radio();


        radio.setCurrentVolume(15);
        radio.increaseVolume();

        int expexted = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int expexted = 9;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldDecreaseVolumeForMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expexted = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }
}

