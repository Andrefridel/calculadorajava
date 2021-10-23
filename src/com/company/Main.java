package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);


        System.out.println("Infome o primeiro número.: ");
        float a1 = Float.parseFloat(scan.nextLine());
        System.out.println("Informe o segundo número.: ");
        float b1 = Float.parseFloat(scan.nextLine());



        float soma = soma(a1,b1);
        float subtracao=subtracao(a1,b1);
        float divisao=divisao(a1,b1);
        float multiplicacao=multiplicacao(a1,b1);

        System.out.println("A soma dos números é " + soma);
        System.out.println("A subtração dos números é " + subtracao);
        System.out.println("A divisão dos números é " + divisao);
        System.out.println("A multiplicação dos números é " + multiplicacao);
    }




    public static float soma (float a, float b) {

        return a+b;
    }

    public static float subtracao ( float a, float b) {

        return a-b;
    }

    public static float divisao (float a, float b) {

        return a/b;
    }

    public static float multiplicacao (float a, float b) {

        return a*b;
    }

}
