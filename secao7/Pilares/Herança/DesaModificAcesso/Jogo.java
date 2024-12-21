package secao7.Pilares.Herança.DesaModificAcesso;

import secao7.Pilares.Herança.Heroi;
import secao7.Pilares.Herança.Monstro;

public class Jogo {
    
    public static void main(String[] args) {
        
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        //j1.andar(Direcao.NORTE);
        //j1.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("M vida " + monstro.vida);
        System.out.println("H vida " + heroi.vida);
    }
}
