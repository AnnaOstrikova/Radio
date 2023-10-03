import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.radio.Radio;

public class RadioTest {

    @Test // Тест на уст-ку радио выше максимума
    public void shouldSetRadioStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку максимальной радиостанции
    public void shouldSetRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку радио меньше минимальной
    public void shouldSetRadioStationLessMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку минимальной станции
    public void shouldSetRadioStationMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test //Тест на уст-ку громкости выше максимальной
    public void shouldSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку максимальной громкости
    public void shouldSetVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку громкости меньше минимальной
    public void shouldSetVolumeLessMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку минимальной громкости
    public void shouldSetVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение след. станции
    public void shouldSetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.setNextCurrentRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение след станции после максимальной
    public void shouldSetNextStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.setNextCurrentRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение станции предыдущей минимальной
    public void shouldSetPrevStationLessMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.setPrevCurrentRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение предыдущей станции
    public void shouldSetPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(6);
        rad.setPrevCurrentRadioStation();
        int expected = 5;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на увеличение громкости
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(66);
        rad.setIncreaseVolume();
        int expected = 67;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на увеличение максимальной громкости
    public void shouldIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уменьшение громкости
    public void shouldReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(23);
        rad.setReduceVolume();
        int expected = 22;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уменьшение минимальной громкости
    public void shouldReduceVolumeLessMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
