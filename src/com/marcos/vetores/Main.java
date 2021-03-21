package com.marcos.vetores;

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

        System.out.println("=================================================\n");

        Lista <Contato> lista  = new Lista (25);


        for (int i = 0 ; i < 10000000; i++) {
            Contato contato = new Contato(
                    "Nick"+i,
                    "nick@gmail.com"+i,
                    20+i
            );
            lista.adiciona(contato);

        }

        System.out.println(lista);

    }
}
