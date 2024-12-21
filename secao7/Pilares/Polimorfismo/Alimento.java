package secao7.Pilares.Polimorfismo;

public class Alimento {

    protected double peso;

    public Alimento(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0 ){
            this.peso = peso;
        }
    }
}
