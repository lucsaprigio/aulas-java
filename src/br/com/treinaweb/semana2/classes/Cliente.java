package br.com.treinaweb.semana2.classes;

// Para criar uma herança entre as classes utilizamos o extends
public class Cliente extends Pessoa {
    private String saldo;

    public Cliente(String nome, String telefone, String endereco, String saldo) {
        // Utilizamos a palavra super, para poder atribuir os valores do constructor criado em pessoa
        super(nome, telefone, endereco);
        this.saldo = saldo;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
