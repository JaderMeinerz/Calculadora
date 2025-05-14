package org.example.model;

public class Calculadora {
    public int soma(int[] numeros) {
        int resultado = 0;
        for (int n : numeros) {
            resultado += n;
        }
        return resultado;
    }

    public int subtracao(int[] numeros) {
        if (numeros.length == 0) return 0;
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public int multiplicacao(int[] numeros) {
        if (numeros.length == 0) return 0;
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        return resultado;
    }

    public int divisao(int[] numeros) {
        if (numeros.length == 0) return 0;
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0){
                throw new ArithmeticException("Divisão por zero detectada.");
            }
            resultado /= numeros[i];
        }
        return resultado;
    }
}
