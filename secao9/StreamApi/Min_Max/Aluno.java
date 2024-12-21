package secao9.StreamApi.Min_Max;

public class Aluno {

    final String nome;
    final double nota;
    final boolean comportado;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.comportado = true;
    }

    public String toString(){
        return nome + " tem nota " + nota;
    }
}

