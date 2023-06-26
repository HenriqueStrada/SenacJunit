package com.senac.senacjunit;

import static org.junit.jupiter.api.Assertions.*;

class calculadoraTest {

    @org.junit.jupiter.api.Test
    void soma() {
        int resultado = calculadora.soma(2, 2);
        Assertions.assertEquals(4, resultado);
    }

    @org.junit.jupiter.api.Test
    void subtracao() {
    }

    @org.junit.jupiter.api.Test
    void divisao() {
    }

    @org.junit.jupiter.api.Test
    void multiplicacao() {
    }
}