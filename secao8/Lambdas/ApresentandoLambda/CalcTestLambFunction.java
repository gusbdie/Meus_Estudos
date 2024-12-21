package ApresentandoLambda;
import java.util.function.BinaryOperator;

//recebe dois parametros e retorna um do mesmo tipo
public class CalcTestLambFunction {

    public static void main(String[] args) {

        //int não consegue virar diretamente uma classe Double
        //por isso, o 2 e 3 viraram 2.0 e 3.0
        
        BinaryOperator<Double> calc = (x, y) -> {return x + y; };

        System.out.println(calc.apply(2.0,3.0));

    
        BinaryOperator<Integer> calc2 = (x, y) -> {return x + y; };

        System.out.println(calc2.apply(2,3));
                       
    }//lambda é uma função em uma linha que simplifica o código
    // não preciso mais criar uma classe para fazer uma soma
}
