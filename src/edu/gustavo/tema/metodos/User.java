package edu.gustavo.tema.metodos;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("On: " + smartTv.isOn);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
    }
}
