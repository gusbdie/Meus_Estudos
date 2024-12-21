package secao9.StreamApi.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//vai aplicar um """IF""" na stream e devolver uma outra que pode ser menor
//defierente do map que se entrou oito index vai sair oito index igual
public class Filter {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.8, false);
        Aluno a2 = new Aluno("Ian", 8.7, true);
        Aluno a3 = new Aluno("Gus", 9.0, true);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Predicate<Aluno> verificaNota = a -> a.nota >= 7;
        Predicate<Aluno> Comportado = a -> a.comportado;
        Function<Aluno, String> aprovado = a -> "Parabéns!" + a.nome;

        alunos.stream()
        .filter(verificaNota)
        .filter(Comportado)
        .map(aprovado)
        .forEach(System.out::println);
    }
}
