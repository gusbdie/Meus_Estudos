package secao9.StreamApi.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);        
        UnaryOperator<String> inverter = s -> (new StringBuilder(s).reverse().toString());
        Function<String, Integer> inteiro = s -> Integer.parseInt(s, 2);

        nums.stream()
        .map(Integer::toBinaryString)
        .map(inverter)
        .map(inteiro)
        .forEach(System.out::println);
    }
}
