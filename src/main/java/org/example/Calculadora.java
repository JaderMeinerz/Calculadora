package org.example;

public class Calculadora {
    public static int soma(int[] numeros) {
        int resultado = 0;
        for (int n : numeros) {
            resultado += n;
        }
        return resultado;
    }

    public static int subtracao(int[] numeros) {
        if (numeros.length == 0) return 0;
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static int multiplicacao(int[] numeros) {
        if (numeros.length == 0) return 0;
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        return resultado;
    }
}
