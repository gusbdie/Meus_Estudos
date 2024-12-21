package classe.DesafioM5;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void Comer(Comida comida){
        this.peso = this.peso + comida.getPeso();
    }

}
