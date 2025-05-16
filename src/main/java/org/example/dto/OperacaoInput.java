package org.example.dto;

public class OperacaoInput {
    private final int[] numeros;
    private final boolean valido;
    private String mensagemErro;

    public OperacaoInput(int[] numeros){
        this.numeros = numeros;
        this.valido = true;
    }

    public OperacaoInput(String mensagemErro){
        this.valido = false;
        this.mensagemErro = mensagemErro;
        this.numeros = new int[0];
    }

    public int[] getNumeros(){
        return numeros;
    }

    public boolean isValido(){
        return valido;
    }

    public String getMensagemErro(){
        return mensagemErro;
    }
}
