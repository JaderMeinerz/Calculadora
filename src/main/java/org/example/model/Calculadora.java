package org.example.model;

import java.util.Arrays;

public class Calculadora {
    public int soma(int[] numeros) {
        return Arrays.stream(numeros).sum();
    }

    public int subtracao(int[] numeros) {
        if (numeros.length == 0) return 0;
        return Arrays.stream(numeros)
                .skip(1)
                .reduce(numeros[0], (a, b) -> a - b);
    }

    public int multiplicacao(int[] numeros) {
        if (numeros.length == 0) return 0;
        return Arrays.stream(numeros)
                .skip(1)
                .reduce(numeros[0], (a, b) -> a * b);
    }

    public int divisao(int[] numeros) {
        if (numeros.length == 0) return 0;
        return Arrays.stream(numeros)
                .skip(1)
                .reduce(numeros[0], (a, b) -> {
                    if (b == 0)
                        throw new ArithmeticException("Divisão por zero detectada.");
                    return a / b;
                });
    }
}


