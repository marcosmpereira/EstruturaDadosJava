package com.marcos.vetores;

public class Lista <T> {

    private T vetor[];
    private int tamanho;

    public Lista(int capacidade) {
        this.vetor = (T[]) new Object [capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(T valor){
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

    public Object buscaValor(int posicao) {
        posicao = posicao -1;
        if(!(posicao >= 0 && posicao < this.tamanho))
            throw new IllegalArgumentException("A posição informada não existe!");
        return this.vetor[posicao];
    }

    public Object buscaValor(Object conteudo) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.vetor[i].equals(conteudo)) {
                return conteudo;
            }
        }
        return null;
    }

    public void adiciona(T conteudo, int posicao) {
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

    public void aumentarCapacidadeVetor(Object elementos) {
        if(this.tamanho == this.vetor.length) {
            T vetorTemporario [] =(T[]) new Object[this.tamanho * 2];
            for(int i = 0; i < tamanho; i++) {
                vetorTemporario[i] = this.vetor[i];
            }
            this.vetor = vetorTemporario;
        }
    }

    public Object getObject(int indice) {
        return this.vetor[indice];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.tamanho; i++) {
            sb.append(this.vetor[i]+",\n ");
        }
        sb.append("]");
        return sb.toString();
    }
}
