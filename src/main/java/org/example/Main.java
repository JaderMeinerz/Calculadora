package org.example;

import org.example.controller.CalculadoraController;
import org.example.model.Calculadora;
import org.example.view.CalculadoraView;

public class Main {
    public static void main(String[] args) {

        // Criando instâncias do modelo, visão e controlador
        Calculadora model = new Calculadora();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(model, view);

        // Menu de operações
        while (true) {
            int operacao = view.mostrarMenu();
            if (operacao == 0) break;
            controller.executarOperacao(operacao);
        }
    }
}
