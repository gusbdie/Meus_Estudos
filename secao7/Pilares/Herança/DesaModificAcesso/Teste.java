package secao7.Pilares.Herança.DesaModificAcesso;

import secao7.Pilares.Herança.Desafio.Ferrari;
import secao7.Pilares.Herança.Desafio.Fusca;

public class Teste {

    public static void main(String[] args) {
     //Carro aqui em baixo da na mesma(na esquerda)
        Ferrari ferrari = new Ferrari(315);
        Fusca fusca = new Fusca(212);

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();

        System.out.println(ferrari.veloAtual);

        fusca.acelerar();
        fusca.acelerar();
        fusca.frear();

        System.out.println(fusca.veloAtual);
    }
}
