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
        this.aumentarCapacidadeVetor(valor);
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
        if(!(posicao >= 0 && posicao < this.tamanho))
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

    public void adiciona(String conteudo, int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho))
            throw new IllegalArgumentException("A posição informada não existe!");

        this.aumentarCapacidadeVetor(conteudo);
        for(int i = this.tamanho -1; i >= posicao; i--) {
            this.vetor[i+1] = this.vetor[i];
        }
        this.vetor[posicao] = conteudo;
        this.tamanho++;
    }

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho))
            throw new IllegalArgumentException("A posição informada não existe!");

        for(int i = posicao; i < this.tamanho -1 ; i++) {
            this.vetor[i] = this.vetor[i + 1];
        }
        this.tamanho--;
    }

    public void aumentarCapacidadeVetor(String elementos) {
        if(this.tamanho == this.vetor.length) {
            String vetorTemporario [] = new String[this.tamanho * 2];
            for(int i = 0; i < tamanho; i++) {
                vetorTemporario[i] = this.vetor[i];
            }
            this.vetor = vetorTemporario;
        }
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
