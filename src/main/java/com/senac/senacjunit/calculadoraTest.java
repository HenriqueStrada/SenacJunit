package com.senac.senacjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculadoraTest {

    @Test
    void soma() {
        int resultado = calculadora.soma(2,2);
        Assertions.assertEquals(4, resultado);
    }
    @Test
    void subtracao() {
        int resultado = calculadora.subtracao(5,3);;
        Assertions.assertEquals(2, resultado);
    }
    @Test
    void divisao() {
        int resultado = calculadora.divisao(10, 2);
        Assertions.assertEquals(5, resultado);
    }

    @Test
    void multiplicacao() {
        int resultado = calculadora.multiplicacao(5,2);
        Assertions.assertEquals(10, resultado);
    }
}