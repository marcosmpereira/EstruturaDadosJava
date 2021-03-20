package com.marcos.vetores;

public class Main {

    public static void main(String args[]) {
        Vetor vetor = new Vetor(1);
        vetor.adiciona("Lessie");
        vetor.adiciona("Nick");
        vetor.adiciona("Dollys");
        vetor.adiciona("Tarzan");
        System.out.println(vetor);
//        System.out.println(vetor.tamanho());
//        System.out.println(vetor.buscaValor("Lessie"));
        vetor.remove(1);
        vetor.remove(2);
        System.out.println(vetor);
    }
}
