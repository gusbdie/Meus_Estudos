package BinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.BiFunction;

public class OperadorBinario {

    public static void main(String[] args) {
        
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));
    

        //primeira var, segunda var, retorno
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notFinal = (n1 + n2) / 2;
            return notFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(9.7, 4.1));
            

        Function<Double, String> conceito = m -> m>= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 5.1));
    }
}
