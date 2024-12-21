package secao9.StreamApi.Min_Max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min_Max {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7);
        Aluno a2 = new Aluno("Ian", 6);
        Aluno a3 = new Aluno("Gus", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Comparator<Aluno> melhorNota = (n1, n2) -> {
            if(a1.nota > a2.nota) return 1;
            if(a1.nota < a2.nota) return -1;
            return 0;
        }; 

        Comparator<Aluno> piorNota = (n1, n2) -> {
            if(a1.nota > a2.nota) return -1;
            if(a1.nota < a2.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());


    }
}
