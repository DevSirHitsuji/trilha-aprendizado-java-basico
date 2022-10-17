package edu.gustavo.tema.metodos;

public class SmartTv {
    boolean isOn = false;
    int volume = 1;
    int channel = 10;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void volumeUp(){
        volume++;
    }

    public void volumeDown(){
        volume--;
    }

    public void changeChanneUp(){
        channel++;
    }

    public void changeChannelDown(){
        channel--;
    }
}
