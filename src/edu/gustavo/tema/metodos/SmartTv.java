package edu.gustavo.tema.metodos;
/**
 * <h1>SmartTv</h1>
 * <p>Essa smart tv possui algumas funções basicas de uma televisão</p>
 * 
 * <b>Note:</b> Leia atentamente esta documentação para desfrutar dos recurso da tv
 * 
 * @author Gustavo Silva
 * @version 1.0
 * @since 18/10/2022
 * 
 */
public class SmartTv {
    /**
     * Esta classe é um objeto chamado tv com alguns atributos padrao
     */
    boolean isOn = false;
    int volume = 1;
    int channel = 10;

    public void turnOn(){
        /**
         * liga a televisão
         */
        isOn = true;
    }

    public void turnOff(){
        /**
         * Desliga a televisão
         */
        isOn = false;
    }

    public void volumeUp(){
        /**
         * aumenta o volume da televisão em +1
         */
        volume++;
    }

    public void volumeDown(){
        /**
         * Diminui o volume da televisão em -1
         */
        volume--;
    }

    public void changeChanneUp(){
        /**
         * Muda o canal em +1
         */
        channel++;
    }

    public void changeChannelDown(){
        /**
         * Muda o canal em -1
         */
        channel--;
    }
}
