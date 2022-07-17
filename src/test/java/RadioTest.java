import org.junit.jupiter.api.Test;

import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void test1RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(0);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void test2RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(9);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
void  test3RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(-5);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void  test4RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(10);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void  test5RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(5);
        radio.prevRadio();
        int actual = radio.getRadio();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    void  test6RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(11);
        radio.prevRadio();
        int actual = radio.getRadio();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void  test7RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(0);
        radio.prevRadio();
        int actual = radio.getRadio();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void  test8RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(10);
        radio.prevRadio();
        int actual = radio.getRadio();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void  test9VolumeUp() {
        Radio radio = new Radio();

        radio.setVolume(5);
        radio.volumeUp();
        int actual = radio.getVolume();
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    void  test10VolumeUp() {
        Radio radio = new Radio();

        radio.setVolume(12);
        radio.volumeUp();
        int actual = radio.getVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void  test11VolumeUp() {
        Radio radio = new Radio();

        radio.setVolume(3);
        radio.volumeDown();
        int actual = radio.getVolume();
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void  test12VolumeUp() {
        Radio radio = new Radio();

        radio.setVolume(-5);
        radio.volumeDown();
        int actual = radio.getVolume();
        int expected = 0;

        assertEquals(actual, expected);

    }
}
