package Secao10.Exception.TryCatch;
public class Basico {

    public static void main(String[] args) {
       //System.out.println(7 / 0);//java.lang.ArithmeticException
    
        Aluno a1 = null;
       // imprimirNomeDoAluno(a1);//java.lang.NullPointerException

        try{
            imprimirNomeDoAluno(a1);
        } catch(Exception excecao){
            System.out.println("Ocorreu um erro ao imprimir o nome do usuário");
        }

        try{
            System.out.println(7 / 0);
        }catch(ArithmeticException e){
            e.printStackTrace();//lista de métodos chamados até acontecer o erro
        }

        System.out.println("FIM");
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
    
}
