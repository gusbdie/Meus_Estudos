package Secao10.Exception.ExcecaoPersonalizada1;

import Secao10.Exception.TryCatch.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Ana", -7);

        try{
        Validar.aluno(aluno);
        }catch(StringVaziaException e){
            System.out.println(e.getMessage());
        }catch(NumeroForaDoIntervaloException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("FIM");
    }
}