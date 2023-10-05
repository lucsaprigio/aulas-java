package br.com.treinaweb.semana2.classes;

public class Atendimento {

    // Quando coloco private eu crio um encapsulamento, então esse método não vai poder ser alterado/visualizado fora da classe
    private int horas;

    // Setter vai atribuir o valor no meu atributo privado
    public void setHoras(int horas){
        if(horas < 1 || horas > 12) {
            System.out.println("A quantidade de horas de um atendimento não pode ser menor que 1, e nem maior que 12");
        } else {
            this.horas = horas;
        }
    }

    // Geter vai retornar o valor do meu atributo, não pode ser void, pois retorna o próprio atributo
    public int getHoras() {
        return horas;
    }
}
