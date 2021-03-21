package com.marcos.vetores;

import java.util.Objects;

public class Contato {
    private String nome;
    private String email;
    private int idade;

    public Contato(){}

    public Contato(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Contato(Contato contato){
        this.nome = contato.getNome();
        this.idade = contato.getIdade();
        this.email = contato.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("nome:"+this.nome+",");
        sb.append("email:"+this.email+",");
        sb.append("idade:"+this.idade);
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return idade == contato.idade && Objects.equals(nome, contato.nome) && Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, idade);
    }
}
