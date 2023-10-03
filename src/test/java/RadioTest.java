import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.radio.Radio;

public class RadioTest {
    Radio rad = new Radio();
    @Test // Тест на уст-ку радио выше максимума
    public void shouldSetRadioStationAboveMax() {
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test// Тест на уст-ку радостанции
    public void shouldSetRadioStation(){
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(20);
        int expected = 20;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку радио выше максимума
    public void setRadioStationAboveMax() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(35);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку максимальной радиостанции
    public void shouldSetRadioStationMax() {
        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку максимальной радиостанции
    public void setRadioStationMax() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(34);
        int expected = 34;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test // Тест на уст-ку радио меньше минимальной
    public void shouldSetRadioStationLessMin() {
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку радио меньше минимальной
    public void setRadioStationLessMin() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку минимальной станции
    public void shouldSetRadioStationMin() {
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку минимальной станции
    public void setRadioStationMin() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test //Тест на уст-ку громкости выше максимальной
    public void shouldSetVolumeAboveMax() {
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку максимальной громкости
    public void shouldSetVolumeMax() {
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку громкости меньше минимальной
    public void shouldSetVolumeLessMin() {
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уст-ку минимальной громкости
    public void shouldSetVolumeMin() {
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение след. станции
    public void shouldSetNextStation() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(30);
        rad.setNextCurrentRadioStation();
        int expected = 31;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение след. станции
    public void setNextStation() {
        rad.setCurrentRadioStation(8);
        rad.setNextCurrentRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение след станции после максимальной
    public void setNextStationAboveMax() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(34);
        rad.setNextCurrentRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test // Тест на переключение след станции после максимальной
    public void shouldSetNextStationAboveMax() {
        rad.setCurrentRadioStation(9);
        rad.setNextCurrentRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение станции предыдущей минимальной
    public void setPrevStationLessMin() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(0);
        rad.setPrevCurrentRadioStation();
        int expected = 34;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test // Тест на переключение станции предыдущей минимальной
    public void shouldSetPrevStationLessMin() {
        rad.setCurrentRadioStation(0);
        rad.setPrevCurrentRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение предыдущей станции
    public void setPrevRadioStation() {
        Radio rad = new Radio(35);
        rad.setCurrentRadioStation(20);
        rad.setPrevCurrentRadioStation();
        int expected = 19;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на переключение предыдущей станции
    public void shouldSetPrevRadioStation() {
        rad.setCurrentRadioStation(6);
        rad.setPrevCurrentRadioStation();
        int expected = 5;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на увеличение громкости
    public void shouldIncreaseVolume() {
        rad.setCurrentVolume(66);
        rad.setIncreaseVolume();
        int expected = 67;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на увеличение максимальной громкости
    public void shouldIncreaseVolumeAboveMax() {
        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уменьшение громкости
    public void shouldReduceVolume() {
        rad.setCurrentVolume(23);
        rad.setReduceVolume();
        int expected = 22;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест на уменьшение минимальной громкости
    public void shouldReduceVolumeLessMin() {
        rad.setCurrentVolume(0);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
