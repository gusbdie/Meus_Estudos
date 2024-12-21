package Supplier;

import java.util.function.Supplier;
import java.util.List;
import java.util.Arrays;

//não recebe nenhum parâmetro e retorna algo
public class Fornecedor {
    public static void main(String[] args) {
        
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia");
    
        System.out.println(umaLista.get());
    }
}
