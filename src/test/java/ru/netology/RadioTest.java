package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void idStationTest() {
        Radio radio = new Radio();

        radio.setIdStation(5);

        int expected = 5;
        int actual = radio.getIdStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void idStationAboveLimitTest() {
        Radio radio = new Radio();

        radio.setIdStation(11);

        int expected = 0;
        int actual = radio.getIdStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void idStationBelowLimitTest() {
        Radio radio = new Radio();

        radio.setIdStation(-1);

        int expected = 0;
        int actual = radio.getIdStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void idStationNextAboveLimitTest() {
        Radio radio = new Radio();

        radio.setIdStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getIdStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void idStationPrevBelowLimitTest() {
        Radio radio = new Radio();

        radio.setIdStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getIdStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void idStationNextTest() {
        Radio radio = new Radio();

        radio.setIdStation(7);
        radio.next();

        int expected = 8;
        int actual = radio.getIdStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void idStationPrevTest() {
        Radio radio = new Radio();

        radio.setIdStation(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getIdStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeAboveLimitTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.setCurrentVolume(11);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowLimitTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveLimitTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.reduceVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
