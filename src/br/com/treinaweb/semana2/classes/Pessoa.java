package br.com.treinaweb.semana2.classes;

public class Pessoa {

    // Vamos usar o padrão pojo, que colocamos o atributo como private e atribuimos os Getters e Setters nele

    // Quando uso o protected, ele não fica visível nas classes, não vai ter visibilidade, somente nas classes filhas (heranças)
    private String nome;

    private String telefone;

    private String endereco;

    //Constructor
    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome; 
        this.telefone = nome;
        this.endereco = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
