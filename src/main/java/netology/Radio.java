package netology;

public class Radio {
    private int currentRadioStation; // от 0 до 9
    private int currentVolume; // от 0 до 100

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation >= 9) {
            currentRadioStation = 9;
            return;
        }
        if (newCurrentRadioStation <= 0) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void Next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void Prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 100) {
            currentVolume = 100;
            return;
        }
        if (newCurrentVolume <= 0) {
            currentVolume = 0;
            return;
        }
        currentVolume = newCurrentVolume;
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
