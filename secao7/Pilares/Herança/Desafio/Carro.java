package secao7.Pilares.Herança.Desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    public int veloAtual;

    public Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(this.veloAtual + 5 > VELOCIDADE_MAXIMA){
            veloAtual = VELOCIDADE_MAXIMA;
        }else
        this.veloAtual += 10;
    }

    public void frear(){

        if(veloAtual >= 10){
            this.veloAtual -= 10;
        }
    }
}

