package secao7.Pilares.Herança.Desafio;

public class Ferrari extends Carro{

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
   
    public void acelerar(){
        super.veloAtual += 30;
    }
}
