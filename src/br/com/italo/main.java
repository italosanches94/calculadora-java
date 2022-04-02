package br.com.italo;

import java.util.Scanner;

public class main extends calculadora {
    public static void main(String[] args) {
        calculadora Calc = new calculadora();
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        float a = ler.nextFloat();
        System.out.println("Insira o segundo numero: ");
        float b = ler.nextFloat();

        double somar = somar(a,b);
        System.out.println("Soma: "+somar);
        double subtrair = subtrair(a,b);
        System.out.println("Subtracao: "+subtrair);
        double multiplicar = multiplicar(a,b);
        System.out.println("Multiplicao: "+multiplicar);
        double dividir = dividir(a,b);
        System.out.println("Divisao: "+dividir);

    }

}
