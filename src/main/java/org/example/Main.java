package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static int menu() {
        //Mostramos o menu e pedimos que selecione o número da operação desejada
        System.out.println("Qual operação você gostaria de efetuar?(Digite o número)");
        System.out.println("[1] - Soma ");
        System.out.println("[2] - Subtração");
        System.out.println("[0] - Encerrar ");
        //Captura o número da seleção desejada e retorna para a função main
        return sc.nextInt();
    }
    public static int[] lerDoisNumeros(String operacao) {
        // TODO: Considerar mais de 2 números

        //Pergunta o primeiro número
        System.out.println("Qual o primeiro número que você deseja " + operacao + "? ");
        //Guarda o primeiro número
        int a = sc.nextInt();
        //Pergunta o segundo número
        System.out.println("Qual o segundo número que você deseja " + operacao + "?");
        //Guarda o segundo número
        int b = sc.nextInt();
        //Retorna a soma dos dois números
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        // TODO: tratar entrada inválida (ex: letra ao invés de número)
        while (true) {
            int [] numeros;
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
                    numeros = lerDoisNumeros("somar");
                    System.out.println("O resultado da soma é igual a " + Calculadora.soma(numeros));
                    break;
                case 2:
                    //Caso selecione a opção 2(subtração), chama a função subtração para resolver a operação
                    numeros = lerDoisNumeros("subtrair");
                    System.out.println("O resultado da subtração é igual a " + Calculadora.subtracao(numeros));
                    break;
                default:
                    //Caso não encontre a operação desejada retorna que a operação não foi encontrada
                    System.out.println("Operação não encontrada");
                    break;
            }
        }
    }
}