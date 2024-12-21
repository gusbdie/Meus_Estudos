
//ele transforma uma stream de dados em algo completamente diferente
//um array de alunos pode retornar apenas um valor como a média de notas

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceEx1 {

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;

        int total = nums.stream()
        .reduce(soma)
        .get();
        System.out.println(total);

        Integer total2 = nums.parallelStream()
        .reduce(100, soma);
        System.out.println(total2);//resultado: 945 por causa do parallel
    
        nums.stream()
        .filter(n -> n>5)
        .reduce(soma)
        .ifPresent(System.out::println);//resultado: 30
    }
}
