package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Atendimento;
import br.com.treinaweb.semana2.classes.Cliente;
import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        // Criamos uma instancia da classe criada Diarista
        var lucas = new Diarista("Lucas", "9999999999", "Av Silvio Avidos", "123");
        
/*         
        Como criamos um constructor na classe, agora temos que passar o valor diretamente na classe como métodos;

        lucas.nome = "Lucas da Silva";
        lucas.telefone = "1111111";
        lucas.endereco = "teste"; 
        
*/

        System.out.println("Nome: " + lucas.getNome());        
        System.out.println("Nome: " + lucas.getTelefone());
        System.out.println("Nome: " + lucas.getTelefone());
        lucas.atender("Cleyton");


        var cliente = new Cliente("Lucas Aprigio", "teste", "teste", "123");

        System.out.println("Nome: " + cliente.getNome()); 
        System.out.println("Nome: " + cliente.getTelefone());
        System.out.println("Nome: " + cliente.getEndereco());        
        System.out.println("Nome: " + cliente.getSaldo());

        var atendimento = new Atendimento();
        atendimento.setHoras(12);

         System.out.println(atendimento.getHoras());
    }

}