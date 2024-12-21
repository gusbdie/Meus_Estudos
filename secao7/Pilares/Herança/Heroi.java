package secao7.Pilares.Herança;

public class Heroi extends Jogador {
    //podemos sobrescrever uma característica da superclasse

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.vida -= 20;
            return true;
        } else if(deltaX == 1 && deltaY == 0){
            oponente.vida -= 20;
            return true;
        }
        return false;
    }
}
