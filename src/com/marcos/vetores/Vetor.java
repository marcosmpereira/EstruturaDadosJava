package com.marcos.vetores;

import java.util.Arrays;

public class Vetor {

    private String vetor[];
    private int tamanho;

    public Vetor(int capacidade) {
        this.vetor = new String [capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String valor){
       if(this.tamanho < this.vetor.length) {
           this.vetor[this.tamanho] = valor;
           this.tamanho++;
           return true;
       }
       return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String buscaValor(int posicao) {
        posicao = posicao -1;
        if(!(posicao > 0 && posicao < this.tamanho))
            throw new IllegalArgumentException("A posição informada não existe!");
        return this.vetor[posicao];
    }

    public String buscaValor(String conteudo) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.vetor[i].equals(conteudo)) {
                return conteudo;
            }
        }
       return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.tamanho; i++) {
            sb.append(this.vetor[i]+", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
