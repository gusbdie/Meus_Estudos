package Predicate;

import java.util.function.Predicate;

//pega um parametro e retornar verdadeiro ou falso
public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        //acima de 750 "é caro", logo, retonra true
    

        Produto produto = new Produto("Notebook", 3500.00, 0.85);
        System.out.println(isCaro.test(produto));

    }
}
