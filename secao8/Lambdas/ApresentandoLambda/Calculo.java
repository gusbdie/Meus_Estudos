package ApresentandoLambda;
@FunctionalInterface //isso faz que se eu colocar uma outra função 
                     // nesta interface ocorrerá erro

public interface Calculo {

    public abstract double executar(double a, double b);
}