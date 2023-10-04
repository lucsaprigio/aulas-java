package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        // Criamos uma instancia da classe criada Diarista
        var lucas = new Diarista("Lucas", "9999999999", "Av Silvio Avidos");
        
/*         
        Como criamos um constructor na classe, agora temos que passar o valor diretamente na classe como métodos;

        lucas.nome = "Lucas da Silva";
        lucas.telefone = "1111111";
        lucas.endereco = "teste"; 
        
*/

        System.out.println("Nome: " + lucas.nome);        
        System.out.println("Nome: " + lucas.telefone);
        System.out.println("Nome: " + lucas.endereco);
        lucas.atender("Cleyton");
;
    }
}