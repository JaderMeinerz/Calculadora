package org.example;

import org.example.model.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Nested
    @DisplayName("Testes de Soma")
    class SomaTests {
        @Test
        public void testSomaDoisNumerosPositivos() {
            assertEquals(5, Calculadora.soma(new int[]{2, 3}));
        }

        @Test
        public void testSomaComZero() {
            assertEquals(7, Calculadora.soma(new int[]{7, 0}));
        }

        @Test
        public void testSomaComNumeroNegativo() {
            assertEquals(1, Calculadora.soma(new int[]{3, -2}));
        }

        @Test
        public void testSomaTresNumerosPositivos() {
            assertEquals(18, Calculadora.soma(new int[]{5, 12, 1}));
        }

        @Test
        public void testSomaComListaVazia(){
            assertEquals(0, Calculadora.soma(new int[]{}));
        }
    }

    @Nested
    @DisplayName("Testes de Subtração")
    class SubtracaoTests {
        @Test
        public void testSubtracaoDoisNumeroPositivos() {
            assertEquals(5, Calculadora.subtracao(new int[]{15, 10}));
        }

        @Test
        public void testSubtracaoTresNumerosPositivos() {
            assertEquals(2, Calculadora.subtracao(new int[]{30, 15, 13}));
        }

        @Test
        public void testSubtracaoComZero() {
            assertEquals(2, Calculadora.subtracao(new int[]{7, 0, 5}));
        }

        @Test
        void testSubtracaoComNumeroNegativo() {
            assertEquals(-6, Calculadora.subtracao(new int[]{-5, -7, 8}));
        }

        @Test
        void testSubtracaoComListaVazia(){
            assertEquals(0, Calculadora.subtracao(new int[]{}));
        }
    }

    @Nested
    @DisplayName("Testes de Multiplicação")
    class MultiplicacaoTests {
        @Test
        void testMultiplicacaoComDoisNumeros() {
            assertEquals(30, Calculadora.multiplicacao(new int[]{6, 5}));
        }

        @Test
        void testMultiplicacaoComTresNumeros() {
            assertEquals(120, Calculadora.multiplicacao(new int[]{3, 4, 10}));
        }

        @Test
        void testMultiplicacaoComNumeroNegativo() {
            assertEquals(-90, Calculadora.multiplicacao(new int[]{15, 2, -3}));
        }

        @Test
        void testMultiplicacaoComZero() {
            assertEquals(0, Calculadora.multiplicacao(new int[]{8, 0, 15, 19}));
        }

        @Test
        void testMultiplicacaoComListaVazia(){
            assertEquals(0, Calculadora.multiplicacao(new int[]{}));
        }
    }

    @Nested
    @DisplayName("Testes de Divisão")
    class DivisaoTests {
        @Test
        void testDivisaoComZero() {
            assertThrows(ArithmeticException.class, () -> Calculadora.divisao(new int[]{100, 2, 0}));
        }

        @Test
        void testDivisaoComDoisNumeros() {
            assertEquals(6, Calculadora.divisao(new int[]{180, 30}));
        }

        @Test
        void testDivisaoComNumeroNegativo() {
            assertEquals(-2, Calculadora.divisao(new int[]{20, -10}));
        }

        @Test
        void testDivisaoComNumerosIguais() {
            assertEquals(1, Calculadora.divisao(new int[]{10, 10}));
        }

        @Test
        void testDivisaoComListaVazia(){
            assertEquals(0, Calculadora.divisao(new int[]{}));
        }
    }

}
