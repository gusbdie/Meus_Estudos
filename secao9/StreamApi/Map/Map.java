package secao9.StreamApi.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

//pega uma Stream e aplica uma função nela pra cada elemento e retorna uma
//nova Stream com a função aplicada
public class Map {

    public static void main(String[] args) {
        //consigo ter uma Strem de produtos e gerar uma strem de Strings
        // no caso o nome dos produtos
    
        Consumer<String> print = System.out::println;
        List<String> marcas = Arrays.asList("BMW", "Honda", "Audi");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //outra forma de fazer
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        //n.charAR(0) retorna o primeiro caracter da palavra porém como
        //to usando um Unary ele tem que retonrar String por isso + ""
        UnaryOperator<String> grito = n -> n + "!!!";
        //posso crirar esses três Unary em uma classe só para poupar código

        marcas.stream()
        .map(maiuscula)
        .map(primeiraLetra)
        .map(grito)
        .forEach(print);
    }
}
 