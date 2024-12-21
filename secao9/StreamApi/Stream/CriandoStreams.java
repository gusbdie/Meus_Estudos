package secao9.StreamApi.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        
        Consumer<String> print = System.out::println;
        //não preciso mais ficar criando um System.out.println

        Stream<String> langs = Stream.of("Java", "Lua", "Go");
        langs.forEach(print);

        //Criando Array
        String[] maisLangs = {"Python", "Pearl", "Ruby"};
        Stream.of(maisLangs).forEach(print);
        //Agora eu entendi do pq ele fez Stream.of ali em cima
        //fez pra mostrar que podemos utilizá-lo para pegar todos os
        //componentes de qualquer Array

        Arrays.stream(maisLangs, 0, 2).forEach(print);
        //posso ou não escolher quantos componentes do array quero pegar
        //nesse caso vai printar o 1 e o 2 (Python e Pearl)

        List<String> outrasLangs = Arrays.asList("C", "PHP", "JSCRIPT");
        outrasLangs.parallelStream().forEach(print);
        //parallelStream faz sair em ordem aleatória, se eu quero em ordem
        //usa o stream normal
    
        Stream.generate(() -> "a").forEach(print);
        //vai gerar uma Stream potencialmente infinita que não tem ordem
        //Stream.iterate(0, n -> n +1) faz infinito porém ordenado
    }
}
