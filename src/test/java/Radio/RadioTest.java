package Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testMaxRadioStation() {
        Radio radio = new Radio(25);

        Assertions.assertEquals(25, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(25);

        int expexted = 25;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);

    }
    @Test
    public void shouldSetRadioStationForNegativ() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(-2);

        int expexted = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(35);

        int expexted = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldNextRadioStationForMin() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        int expexted = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNextRadioStationForMax() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.nextRadioStation();

        int expexted = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);


    }

    @Test
    public void shouldNextRadioStationAboveMax() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(35);
        radio.nextRadioStation();

        int expexted = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);

    }


    @Test
    public void shouldPrevRadioStationForMin() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.prevRadioStation();

        int expexted = radio.getMaxRadioStation();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(2);
        radio.prevRadioStation();

        int expexted = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldPrevRadioStationAboveMax() {
        Radio radio = new Radio(25);

        radio.setCurrentRadioStation(35);
        radio.prevRadioStation();

        int expexted = radio.getMaxRadioStation();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);

    }


    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio(25);

        radio.setCurrentVolume(100);

        int expexted = radio.maxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio(25);

        radio.setCurrentVolume(0);

        int expexted = radio.minVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldIncreaseVolumeForMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expexted = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();


        radio.setCurrentVolume(115);
        radio.increaseVolume();

        int expexted = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expexted = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldDecreaseVolumeForMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expexted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);

    }
    @Test
    public void shouldSetCurrentVolumeForNegativ() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-5);
        radio.decreaseVolume();

        int expexted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);

    }
}

