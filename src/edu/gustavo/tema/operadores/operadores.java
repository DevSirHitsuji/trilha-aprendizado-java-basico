package edu.gustavo.tema.operadores;

public class operadores {
    public static void main(String[] args) {
        //operadore de atribuição
        int num = 120;

        //operadores aritmeticos
        double soma = 10.5 + 23.1;
        int subtracao = 10 - 2; //etc...

        //operadores unarios
        soma += 1;
        soma -= 4.6;
        soma *= 2;
        soma /= 4;
        soma ++;
        System.out.println(soma);

        //operadores relacionais
        boolean resultado = 10 == 1;
        resultado = 1 != 3;
        resultado = 1 > 1;
        resultado = 1 < 1;
        resultado = 1 >= 2;
        resultado = 1 <= 2;

        //operadores logicos
        boolean condicao1 = true, condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas sao verdadeiras");
        }else{
            System.out.println("pelo menos uma das condições é falsa");
        }

        if(condicao1 || condicao2){
            System.out.println("pelo menos um das condições sao verdadeiras");
        }else{
            System.out.println("as duas são falsas");
        }
        
        //operador ternario
        // <expressao condicional> ? <se for true> : <se for false>
        double expressao1 = (50/2 - 10 + 5);
        double expressao2 = (40/2);
        String resultados = (expressao1 == expressao2) ? "vdd" : "mentira";
        System.out.println(resultados);
    }
}
