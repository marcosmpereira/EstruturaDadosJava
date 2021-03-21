package com.marcos.vetores;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        Vetor vetor = new Vetor(8);
        Contato contato1 = new Contato();
        Contato contato2 = new Contato(
            "Marck",
            "meuid3@gmail.com",
            27
        );
        Contato contato3 = new Contato(contato2);
        Contato contato4 = new Contato(contato2);

        contato1.setNome("Marcos Moraes Pereira");
        contato1.setEmail("meuid3@gmail.com");
        contato1.setIdade(28);

        vetor.adiciona(contato1);
        vetor.adiciona(contato2);
        vetor.adiciona(contato3);
        vetor.adiciona(contato3);
        vetor.adiciona(contato3);
        vetor.adiciona(contato3);

        System.out.println(vetor.buscaValor(contato4));

        for(int i = 0; i < vetor.tamanho(); i++) {
            System.out.println("TESTE:"+ vetor.getObject(i));
        }

        System.out.println("====================== LISTA GENERICA ===========================\n");

        Lista <Contato> lista  = new Lista (25);


        for (int i = 0 ; i < 50; i++) {
            Contato contato = new Contato(
                    "Nick"+i,
                    "nick@gmail.com"+i,
                    20+i
            );
            lista.adiciona(contato);
        }
        System.out.println(lista);
        System.out.println("========================== ARRAY LIST =======================\n");

        ArrayList<Contato> arrayList = new ArrayList();
        arrayList.add(contato1);
        arrayList.add(contato2);
        arrayList.add(contato3);
        arrayList.add(0,contato4);

        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(contato2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.contains(contato4));
        System.out.println(arrayList.size());

        arrayList.remove(contato4);

        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
    }
}
