package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTeste {

    @Test
    public void Soma() throws Exception {
        float valor1 = 8;
        float valor2 = 6;
        Calculadora c = new Calculadora();
        float soma = c.soma(valor1, valor2);
        assertEquals(14f, soma);
    }

    @Test
    public void Subtracao() throws Exception {
        float valor1 = 8;
        float valor2 = 6;
        Calculadora c = new Calculadora();
        float subtracao = c.subtracao(valor1, valor2);
        assertEquals(2f, subtracao);
    }

    @Test
    public void Multiplicacao() throws Exception {
        float valor1 = 8;
        float valor2 = 6;
        Calculadora c = new Calculadora();
        float multiplicacao = c.multiplicacao(valor1, valor2);
        assertEquals(48f, multiplicacao);
    }

    @Test
    public void Divisao() throws Exception {
        float valor1 = 8;
        float valor2 = 4;
        Calculadora c = new Calculadora();
        float divisao = c.divisao(valor1, valor2);
        assertEquals(2f, divisao);
    }

    @Test
    public void Calculo() throws Exception {
        Calculadora c = new Calculadora();
        assertEquals(15f, c.calcular("3 * 5"));
        assertEquals(2f, c.calcular("4 / 2"));
        assertEquals(6f, c.calcular("1 + 5"));
        assertEquals(0f, c.calcular("2 - 2"));
    }
}
