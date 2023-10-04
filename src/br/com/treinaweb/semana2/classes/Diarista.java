package br.com.treinaweb.semana2.classes;

public class Diarista {
    
    // Atributos
    public String nome;

    public String telefone;

    public String endereco;

    //Construtor - tem que ser o mesmo nome da classe, dentro dos parentes coloco os valores
    public Diarista(String nome, String telefone, String endereco) {
        // Pegue o atributo da classe acima, e atribua o valor do método construtor que criamos (Diarista)
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // métodos
    public void atender(String nomeCliente) {
        System.out.println("Realizando atendimento para cliente " + nomeCliente);
    }
}
