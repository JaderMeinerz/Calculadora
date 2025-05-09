package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraTest {
    @Test
    public void testSomaDoisNumerosPositivos(){

        assertEquals(5, Calculadora.soma(new int[]{2,3}));
    }

    @Test
    public void testSomaComZero(){
        assertEquals(7,Calculadora.soma(new int[]{7,0}));
    }

    @Test
    public void testSomaComNumeroNegativo(){
        assertEquals(1, Calculadora.soma(new int[]{3,-2}));
    }

    @Test
    public void testSubtracaoDoisNumeroPositivos(){
        assertEquals(5, Calculadora.subtracao(new int[]{15,10}));
    }

    @Test
    public void testSubtracaoComZero(){
        assertEquals(7, Calculadora.subtracao(new int[]{7, 0}));
    }

    @Test void testSubtracaoComNumeroNegativo(){
        assertEquals(2, Calculadora.subtracao(new int[]{-5, -7}));
    }
}
