import java.util.Objects;

public class Aluno {

    final String nome;
    final double nota;
    final boolean comportado;
    
    public Aluno(String nome, double nota){
        this(nome, nota, true);
    }
    
    public Aluno(String nome, double nota, boolean comportado) {
        this.nome = nome;
        this.nota = nota;
        this.comportado = comportado;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    Aluno other = (Aluno) obj;
    return Double.compare(other.nota, nota) == 0 && nome.equals(other.nome);
}

@Override
public int hashCode() {
    return Objects.hash(nome, nota);
}
}

