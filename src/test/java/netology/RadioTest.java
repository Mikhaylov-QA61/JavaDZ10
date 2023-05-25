package netology;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio radio = new Radio(21);
    @Test
    public void setCurrentRadioStation() {

        radio.setCurrentRadioStation(17);

        int expected = 17;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationAboveMax() {

        radio.setCurrentRadioStation(33);

        int expected = 20;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextCurrentRadioStation() {

        radio.setCurrentRadioStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextCurrentRadioStationAboveMax() {

        radio.setCurrentRadioStation(20);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevCurrentRadioStation() {

        radio.setCurrentRadioStation(8);
        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevCurrentRadioStationUnderMin() {

        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 20;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {

        radio.setCurrentVolume(13);

        int expected = 13;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMax() {

        radio.setCurrentVolume(666);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeUnderMin() {

        radio.setCurrentVolume(-13);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentVolume() {

        radio.setCurrentVolume(13);
        radio.increaseVolume();

        int expected = 14;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentVolumeAboveMax() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolume() {

        radio.setCurrentVolume(13);
        radio.decreaseVolume();

        int expected = 12;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolumeUnderMin() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
