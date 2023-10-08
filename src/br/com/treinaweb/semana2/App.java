package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Atendimento;
import br.com.treinaweb.semana2.classes.Cliente;
import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        // Criamos uma instancia da classe criada Diarista
        var diarista = new Diarista("Lucas", "9999999999", "Av Silvio Avidos", "123");

        System.out.println("Nome: " + diarista.getNome());        
        System.out.println("Nome: " + diarista.getTelefone());
        System.out.println("Nome: " + diarista.getEndereco());
        System.out.println("Chave pix " + diarista.getChavePix());
        System.out.println("Saldo " + diarista.getSaldo());
        diarista.depositar(100);
        System.out.println("Saldo " + diarista.getSaldo());
        diarista.sacar(40);
        System.out.println("Saldo " + diarista.getSaldo());
        diarista.atender("Cleyton");

        var cliente = new Cliente("Lucas", "(27) 9 9694-0045", "Teste");

        System.out.println(cliente.getNome());

        var atendimento = new Atendimento();
        atendimento.setHoras(12);
    }

}