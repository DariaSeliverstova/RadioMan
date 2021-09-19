package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void ShouldRadio1() {
        Radio rad = new Radio();

            rad.setCurrentRadio(-1);

            int expected = 0;
            int actual = rad.getCurrentRadio();

            assertEquals(expected, actual);

        }
    @Test
    void ShouldRadio2() {
        Radio rad = new Radio();

        rad.setCurrentRadio(10);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }

    @Test
        void ShouldNextStation1() {
            Radio rad = new Radio();
            rad.setCurrentRadio(9);

            rad.nextStation();
            int expected = 0;
            int actual = rad.getCurrentRadio();

            assertEquals(expected, actual);

        }

    @Test
    void ShouldNextStation2() {
        Radio rad = new Radio();
        rad.setCurrentRadio(5);

        rad.nextStation();
        int expected = 5;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }

    @Test
    void ShouldBeforeStation1() {
        Radio rad = new Radio();
        rad.setCurrentRadio(-1);

        rad.beforeStation();
        int expected = 9;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }

    @Test
    void ShouldBeforeStation2() {
        Radio rad = new Radio();
        rad.setCurrentRadio(5);

        rad.beforeStation();
        int expected = 5;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }
    @Test
    void shouldVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }



    @Test
    void shouldVolume2() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }



    @Test
    void ShouldNextVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.nextVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldNextVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.nextVolume();
        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void ShouldBeforeVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.beforeVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldBeforeVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.beforeVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    }

