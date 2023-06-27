package com.senac.senacjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class positivoNegativoTest {

    @Test
    void positivoNegativo() {
        String resultado = positivoNegativo.avalia(0);
        Assertions.assertEquals("zero", resultado);
    }
}