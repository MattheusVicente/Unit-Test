package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Digite a operação desejada: ");
        String valor = s.nextLine();
        Calculadora c = new Calculadora();
        System.out.println("O resultado é: " + c.calcular(valor));
    }
}
