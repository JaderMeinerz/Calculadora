package org.example.controller;

import org.example.model.Calculadora;
import org.example.view.CalculadoraView;

public class CalculadoraController {
    private final Calculadora model;
    private final CalculadoraView view;

    public CalculadoraController(Calculadora model, CalculadoraView view) {
        this.model = model;
        this.view = view;
    }

    public void executarOperacao(int operacao) {
        int[] numeros;
        switch (operacao) {
            case 1:
                // Soma
                numeros = view.lerNumeros("somar");
                if (numeros.length > 0) {
                    int resultado = model.soma(numeros);
                    view.mostrarResultado("soma", resultado);
                } else {
                    view.mostrarMensagemErro("Nenhum número informado. Operação cancelada.");
                }
                break;
            case 2:
                // Subtração
                numeros = view.lerNumeros("subtrair");
                if (numeros.length > 0) {
                    int resultado = model.subtracao(numeros);
                    view.mostrarResultado("subtração", resultado);
                } else {
                    view.mostrarMensagemErro("Nenhum número informado. Operação cancelada.");
                }
                break;
            case 3:
                // Multiplicação
                numeros = view.lerNumeros("multiplicar");
                if (numeros.length > 0) {
                    int resultado = model.multiplicacao(numeros);
                    view.mostrarResultado("multiplicação", resultado);
                } else {
                    view.mostrarMensagemErro("Nenhum número informado. Operação cancelada.");
                }
                break;
            case 4:
                // Divisão
                numeros = view.lerNumeros("dividir");
                if (numeros.length > 0) {
                    try {
                        int resultado = model.divisao(numeros);
                        view.mostrarResultado("divisão", resultado);
                    } catch (ArithmeticException e) {
                        view.mostrarMensagemErro("Erro: " + e.getMessage());
                    }
                } else {
                    view.mostrarMensagemErro("Nenhum número informado. Operação cancelada.");
                }
                break;
            case 0:
                //Caso selecione a opçao 0(encerrar)
                System.out.println("Encerrando, até logo!");
                return;
            default:
                //Caso não encontre a operação desejada retorna que a operação não foi encontrada
                System.out.println("Operação não encontrada");
                break;
        }
    }
}
