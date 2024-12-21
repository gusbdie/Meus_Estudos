package secao9.StreamApi.Match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7);
        Aluno a2 = new Aluno("Ian", 6);
        Aluno a3 = new Aluno("Gus", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado));//false
        System.out.println(alunos.stream().anyMatch(aprovado));//true
        System.out.println(alunos.stream().noneMatch(aprovado));//false
        System.out.println(alunos.stream().noneMatch(reprovado));//true

    }
}
