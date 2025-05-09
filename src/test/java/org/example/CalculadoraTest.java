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
    public void testSomaTresNumerosPositivos(){
        assertEquals(18, Calculadora.soma(new int[]{5,12,1}));
    }

    @Test
    public void testSubtracaoDoisNumeroPositivos(){
        assertEquals(5, Calculadora.subtracao(new int[]{15,10}));
    }

    @Test
    public void testSubtracaoTresNumerosPositivos(){
        assertEquals(2, Calculadora.subtracao(new int[]{30,15,13}));
    }
    @Test
    public void testSubtracaoComZero(){
        assertEquals(2, Calculadora.subtracao(new int[]{7,0,5 }));
    }

    @Test void testSubtracaoComNumeroNegativo(){
        assertEquals(-6, Calculadora.subtracao(new int[]{-5, -7, 8}));
    }
}
