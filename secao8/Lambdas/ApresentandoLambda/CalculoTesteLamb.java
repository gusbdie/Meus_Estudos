package ApresentandoLambda;
public class CalculoTesteLamb {

    public static void main(String[] args) {
        
        Calculo calc = (x, y) -> {return x + y; };

        System.out.println(calc.executar(2,3));

        calc = (x,y) -> x * y; // se não ponho as chaves já está implicito
                               // ele retornar essa equação
        System.out.println(calc.executar(2,3));
                            }
}
