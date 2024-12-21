import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceEx3Media {

    public static void main(String[] args) {
        // Media m1 = new Media().adicionar(8.3).adicionar(6.7);
        // Media m2 = new Media().adicionar(7.9).adicionar(6.1);

        // System.out.println(m1.getValor());
        // System.out.println(Media.combinar(m1, m2).getValor());
        //somente testando a classe media

        Aluno a1 = new Aluno("Ana", 7);
        Aluno a2 = new Aluno("Ian", 6);
        Aluno a3 = new Aluno("Gus", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> mostrarNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia = 
        (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = 
        (m1,m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
        .filter(aprovado)
        .map(mostrarNota)
        .reduce( new Media(), calcularMedia, combinarMedia);
        //criou-se esse new Media para inicializar tanto o calcularMedia 
        //quanto o combinarMedia

        System.out.println("A média da turma: " + media.getValor());
    }
}
