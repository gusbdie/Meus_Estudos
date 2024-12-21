import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7);
        Aluno a2 = new Aluno("Ian", 6);
        Aluno a3 = new Aluno("Gus", 8);
        Aluno a4 = new Aluno("Gus", 8);
        Aluno a5 = new Aluno("Ian", 6);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        alunos.stream()
        .forEach(System.out::println);
    }
}
//preciso refazer
