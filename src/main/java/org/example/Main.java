package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static int menu() {
        try {
            //Mostramos o menu e pedimos que selecione o número da operação desejada
            System.out.println("Qual operação você gostaria de efetuar?(Digite o número)");
            System.out.println("[1] - Soma ");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[0] - Encerrar ");
            //Captura o número da seleção desejada e retorna para a função main

            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite um número.");
            sc.nextLine();
            return -1;
        }
    }

    public static int[] lerNumeros(String operacao) {
        int quantidade;
        try {
            //Pergunta com quantos números deseja fazer a operação
            System.out.println("Quantos números você deseja " + operacao + "? ");
            //Guarda essa quantidade
            quantidade = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Operação cancelada.");
            sc.nextLine();
            return new int[0];
        }
        //Cria uma lista para guardar todos os números respondidos
        int[] numeros = new int[quantidade];
        //Estrutura que continuará a perguntar os números até a quantidade desejada
        for (int i = 0; i < quantidade; i++) {
            while (true) {
                try {
                    System.out.println("Digite o " + (i + 1) + "º número a " + operacao + ":");
                    numeros[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    sc.nextLine();
                }
            }
            //Retorna a lista para a função principal
        }
        return numeros;

    }

    private static boolean validarNumeros(int[] numeros){
        if (numeros.length == 0){
            System.out.println("Nenhum número informado. Operação cancelada");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO: tratar entrada inválida (ex: letra ao invés de número)
        while (true) {
            int[] numeros;
            //Chama o menu que retorna o número da operação desejada
            int res = menu();
            //Testa qual a operação desejada e chama a função desejada
            switch (res) {
                case 0:
                    //Caso selecione a opçao 0(encerrar)
                    System.out.println("Encerrando, até logo!");
                    return;
                case 1:
                    //Caso selecione a opção 1(soma), chama a função soma para resolver a operação
                    numeros = lerNumeros("somar");
                    if(!validarNumeros(numeros)) break;
                    System.out.println("O resultado da soma é igual a " + Calculadora.soma(numeros));
                    break;
                case 2:
                    //Caso selecione a opção 2(subtração), chama a função subtração para resolver a operação
                    numeros = lerNumeros("subtrair");
                    if(!validarNumeros(numeros)) break;
                    System.out.println("O resultado da subtração é igual a " + Calculadora.subtracao(numeros));
                    break;
                case 3:
                    //Caso selecione a opção 3(multiplicação), chama a função multiplicação para resolver a operação
                    numeros = lerNumeros("multiplicar");
                    if(!validarNumeros(numeros)) break;
                    System.out.println("O resultado da multiplicação é igual a " + Calculadora.multiplicacao(numeros));
                    break;
                case 4:
                    //Caso selecione a opção 3(divisão), chama a função divisão para resolver a operação
                    numeros = lerNumeros("dividir");
                    if(!validarNumeros(numeros)) break;
                    try {
                        System.out.println("O resultado da divisão é igual a " + Calculadora.divisao(numeros));
                    } catch (ArithmeticException e) {
                        //Enviamos uma mensagem de erro caso o usuário tente dividir por 0(zero)
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                default:
                    //Caso não encontre a operação desejada retorna que a operação não foi encontrada
                    System.out.println("Operação não encontrada");
                    break;
            }
        }
    }
}