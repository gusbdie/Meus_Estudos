package classe.DesafioM5;

public class Jantar {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa( "Gustavo", 72);
        Comida arroz = new Comida("Arroz",1);
        Comida feijao = new Comida("Feijão", 1);   
    
        eu.Comer(arroz);
        eu.Comer(feijao);

        System.out.println("O peso atua da pessoa é: " + eu.getPeso());
    }
}