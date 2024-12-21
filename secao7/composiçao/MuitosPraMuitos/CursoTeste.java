package secao7.composiçao.MuitosPraMuitos;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Pablo");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web Completo");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso1);
    
        for(Aluno aluno: curso2.alunos){
            System.out.println("To matriculado no curso " + curso2.nome);
            System.out.println("Meu nome é " + aluno.nome);
        }
    
        System.out.println(aluno1.cursos.get(0).alunos);//todos os alunos do curso que o aluno1 está
    
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
        
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
