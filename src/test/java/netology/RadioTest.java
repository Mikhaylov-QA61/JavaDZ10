package netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    void setCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-8);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(13);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNextCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.Next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNextCurrentRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.Next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.Prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevCurrentRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.Prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(13);

        int expected = 13;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(666);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-13);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(13);
        radio.increaseVolume();

        int expected = 14;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(13);
        radio.decreaseVolume();

        int expected = 12;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
