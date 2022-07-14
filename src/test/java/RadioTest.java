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
    public void shouldNextRadioStation() {
        Radio radio = new Radio();

        radio.nextRadioStation();

        int expexted = 1;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();

        radio.prevRadioStation();

        int expexted = 9;
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

        radio.increaseVolume();

        int expexted = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        int expexted = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expexted, actual);

    }

}
