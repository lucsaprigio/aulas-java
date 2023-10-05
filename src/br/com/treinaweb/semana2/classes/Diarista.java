package br.com.treinaweb.semana2.classes;

public class Diarista extends Pessoa {

    private String chavePix;
    // Construtor - tem que ser o mesmo nome da classe, dentro dos parentes coloco
    // os valores
    public Diarista(String nome) {
        // quando temos somente um no construtor atual, colocamos null nos outros
        super(nome, null, null);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public Diarista(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;
    }

    // métodos
    public void atender(String nomeCliente) {
        System.out.println("Realizando atendimento para cliente " + nomeCliente);
    }
}
