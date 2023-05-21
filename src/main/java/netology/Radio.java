package netology;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 10;
    private int currentVolume; // от 0 до 100

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            currentRadioStation = maxRadioStation - 1;
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
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void Prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation-1;
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
