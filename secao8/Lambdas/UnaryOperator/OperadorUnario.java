package UnaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {
        
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        System.out.println
        (maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));
        //resultado 16 pois ele vai fazendo as funções conforme aparecem
    
        System.out.println
        (aoQuadrado.compose(vezesDois).compose(maisDois).apply(0));
        //compose faz com que comece do último, vai dar o mesmo resultado

    }
}
