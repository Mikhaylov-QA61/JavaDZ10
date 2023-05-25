package netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int maxCountRadioStation;
    private int currentVolume; // от 0 до 100

    public Radio() {
        this.maxCountRadioStation = 10;
    }

    public Radio(int maxCountRadioStation) {
        this.maxCountRadioStation = maxCountRadioStation;
    }

    public void setCurrentRadioStation(int currentStation) {
        if (currentStation > maxCountRadioStation - 1) {
            this.currentRadioStation = maxCountRadioStation - 1;
            return;
        } else {
            currentRadioStation = currentStation;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxCountRadioStation - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxCountRadioStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 100) {
            this.currentVolume = 100;
            return;
        }
        if (currentVolume <= 0) {
            this.currentVolume = 0;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
