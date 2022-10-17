package edu.gustavo.tema.escopo;

public class Escopo {
    public static void main(String[] args) {
        System.out.println("cara aqui nao tem muito o que fazer kkkk");
    }

    public int theVariable(){
    int num1 = 1;
    return num1;
    }
    public boolean theNewVariable(){
        //num1 += 2;
        //nao fuinciona pois num1 nao esta no escopo global
        return false;
    }
}
