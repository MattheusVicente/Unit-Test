package com.company;

public class Calculadora {

    public float soma(float valor1, float valor2) {
        return valor1 + valor2;
    }

    public float subtracao(float valor1, float valor2) {
        return valor1 - valor2;
    }

    public float divisao(float valor1, float valor2) {
        return valor1 / valor2;
    }

    public float multiplicacao(float valor1, float valor2) {
        return valor1 * valor2;
    }

    public float calcular(String valor) {
        String[] partes = valor.split(" ");

        int valor1 = Integer.valueOf(partes[0]);
        int valor2 = Integer.valueOf(partes[2]);

        if("+".equals(partes[1])) {
            return soma(valor1, valor2);
        }
        else if("-".equals(partes[1])) {
            return subtracao(valor1, valor2);
        }
        else if("*".equals(partes[1])) {
            return multiplicacao(valor1, valor2);
        }
        else if("/".equals(partes[1])) {
            return divisao(valor1, valor2);
        }

        return 0;
    }
}
