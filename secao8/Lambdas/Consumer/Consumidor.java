package Consumer;

import java.util.function.Consumer;

import Predicate.Produto;

import java.util.Arrays;
import java.util.List;

//aceita um parametro e não retorna nada (retorno void)
public class Consumidor {

    public static void main(String[] args) {
        
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
    
        Produto p1 = new Produto("Caneta", 12.34, 0.1);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Copo", 12.34, 0.1);
        Produto p3 = new Produto("Xícara", 12.34, 0.1);


        List<Produto> produtos = Arrays.asList(p1, p2, p3);

        produtos.forEach(imprimirNome);
    }
}
