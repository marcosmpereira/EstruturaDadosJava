package com.marcos.vetores;

public class Main {

    public static void main(String args[]) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Lessie");
        vetor.adiciona("Nick");
        vetor.adiciona("Dollys");
        vetor.adiciona("Tarzan");
        System.out.println(vetor);
//        System.out.println(vetor.tamanho());
//        System.out.println(vetor.buscaValor("Lessie"));
        vetor.insereValor("Marcos", 0);
        System.out.println(vetor);
    }
}
