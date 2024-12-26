package Secao10.Exception.TryCatch;
public class Aluno {

    public final String nome;
    public final double nota;
    public final boolean comportado;

    public Aluno(String nome, double nota){
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean comportado) {
        this.nome = nome;
        this.nota = nota;
        this.comportado = comportado;
    }
}
