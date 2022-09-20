package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio(15);

    @Test
    void idStationTest() {

        radio.setIdStation(8);

        Assertions.assertEquals(8, radio.getIdStation());
    }

    @Test
    void idStationAboveLimitTest() {

        radio.setIdStation(17);

        Assertions.assertEquals(0, radio.getMinIdStation());
    }

    @Test
    void idStationBelowLimitTest() {

        radio.setIdStation(-1);

        Assertions.assertEquals(0, radio.getIdStation());
    }

    @Test
    void idStationNextAboveLimitTest() {

        radio.setIdStation(14);
        radio.next();

        Assertions.assertEquals(0, radio.getIdStation());
    }

    @Test
    void idStationPrevBelowLimitTest() {

        radio.setIdStation(0);
        radio.prev();

        Assertions.assertEquals(14, radio.getMaxIdStation());
    }

    @Test
    void idStationNextTest() {

        radio.setIdStation(7);
        radio.next();

        Assertions.assertEquals(8, radio.getIdStation());
    }

    @Test
    void idStationPrevTest() {

        radio.setIdStation(4);
        radio.prev();

        Assertions.assertEquals(3, radio.getIdStation());
    }

    @Test
    void setVolumeTest() {

        radio.setCurrentVolume(50);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void setVolumeAboveLimitTest() {

        radio.setCurrentVolume(105);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setVolumeBelowLimitTest() {

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAboveLimitTest() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void reduceVolumeBelowLimitTest() {

        radio.setCurrentVolume(0);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeTest() {

        radio.setCurrentVolume(7);
        radio.increaseVolume();

        Assertions.assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void reduceVolumeTest() {

        radio.setCurrentVolume(4);
        radio.reduceVolume();

        Assertions.assertEquals(3, radio.getCurrentVolume());
    }

}
