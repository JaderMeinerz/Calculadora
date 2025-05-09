package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraTest {
    @Test
    public void testSomaDoisNumerosPositivos(){
        assertEquals(5, Calculadora.soma(2,3));
    }

    @Test
    public void testSomaComZero(){
        assertEquals(7,Calculadora.soma(7,0));
    }

    @Test
    public void testSomaComNumeroNegativo(){
        assertEquals(1, Calculadora.soma(3,-2));
    }
}
