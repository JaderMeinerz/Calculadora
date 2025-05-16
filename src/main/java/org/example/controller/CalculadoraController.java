package org.example.controller;

import org.example.dto.OperacaoInput;
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
        OperacaoInput input;
        int resultado;

        switch (operacao) {
            case 1:
                // Soma
                input = view.lerNumeros("somar");
                if (!input.isValido()) {
                    view.mostrarMensagemErro(input.getMensagemErro());
                    return;
                }
                resultado = model.soma(input.getNumeros());
                view.mostrarResultado("soma",resultado);
                break;
            case 2:
                // Subtração
                input = view.lerNumeros("subtrair");
                if (!input.isValido()) {
                    view.mostrarMensagemErro(input.getMensagemErro());
                    return;
                }
                resultado = model.subtracao(input.getNumeros());
                view.mostrarResultado("subtração",resultado);
                break;
            case 3:
                // Multiplicação
                input = view.lerNumeros("multiplicar");
                if (!input.isValido()) {
                    view.mostrarMensagemErro(input.getMensagemErro());
                    return;
                }
                resultado = model.multiplicacao(input.getNumeros());
                view.mostrarResultado("multiplicação",resultado);
                break;
            case 4:
                // Divisão
                input = view.lerNumeros("dividir");
                if (!input.isValido()) {
                    view.mostrarMensagemErro(input.getMensagemErro());
                    return;
                }
                try {
                    resultado = model.divisao(input.getNumeros());
                    view.mostrarResultado("divisão",resultado);
                } catch (ArithmeticException e) {
                    view.mostrarMensagemErro("Erro: " + e.getMessage());
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
