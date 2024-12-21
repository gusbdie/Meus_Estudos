import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceEx2Aluno {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7);
        Aluno a2 = new Aluno("Ian", 6);
        Aluno a3 = new Aluno("Gus", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> nota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream()
        .filter(aprovado)
        .map(nota)
        .reduce(somatorio)
        .ifPresent(System.out::println);
    }
}
