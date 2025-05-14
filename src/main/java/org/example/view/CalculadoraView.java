package org.example.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraView {
    private static final Scanner sc = new Scanner(System.in);
    public int mostrarMenu() {
            //Mostramos o menu e pedimos que selecione o número da operação desejada
        try {
            System.out.println("Qual operação você gostaria de efetuar?(Digite o número)");
            System.out.println("[1] - Soma ");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[0] - Encerrar ");
            //Captura o número da seleção desejada e retorna para a função main
            return sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            return -1;
        }
    }

    public static int lerQuantidade(String operacao){
        int quantidade;
        try {
            //Pergunta com quantos números deseja fazer a operação
            System.out.println("Quantos números você deseja " + operacao + "? ");
            //Guarda essa quantidade
            quantidade = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Operação cancelada.");
            sc.nextLine();
            return 0;
        }
        return quantidade;
    }
    public static int[] lerNumeros(String operacao) {
        int quantidade = lerQuantidade(operacao);

        //Caso o usuário cacele ou erre, evita Array com tamanho inválido
        if(quantidade<=0){
            return new int[0];
        }
        //Cria uma lista para guardar todos os números respondidos
        int[] numeros = new int[quantidade];
        //Estrutura que continuará a perguntar os números até a quantidade desejada
        for (int i = 0; i < numeros.length; i++) {
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

    public void mostrarResultado(String operacao, int resultado) {
        System.out.println("O resultado da " + operacao +" é: " + resultado);
    }

    public void mostrarMensagemErro(String mensagem){
        System.out.println(mensagem);
    }
}
