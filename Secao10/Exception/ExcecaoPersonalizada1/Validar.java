package Secao10.Exception.ExcecaoPersonalizada1;

import Secao10.Exception.TryCatch.Aluno;

public class Validar {

    private Validar() {}
    
    public static void aluno (Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("O aluno está nulo");
        }
        //aluno.nome.trim().isEmpty tira os espaços em branco 
        //do inicio e do final da String:    João P    .-> João P.
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }
        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaDoIntervaloException("nota");
        }
    }
}
