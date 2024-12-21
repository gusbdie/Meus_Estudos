package Foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("ana", "bia", "lia", "gui");
    
        for(String nome: aprovados){ //forma comum de passar por uma List
            System.out.println(nome);
        }

        //lambda #01
        aprovados.forEach((nome) -> System.out.println(nome));
        //consigo personalizar (adicionar !!! por exemplo)

        //Method Reference
        aprovados.forEach(System.out::println);
        //não consigo personalizar diretamente(adicioanr !!! por exemplo)
    
        //lambda #02
        aprovados.forEach(nome -> meuImprimir(nome));
    }

    static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome é " + nome);
    }
}

