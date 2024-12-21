package secao9.StreamApi.Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

    List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca");
        //formas de listar isso

        System.out.println("Usando foreach");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("Usando Iterator");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
        //dentro de funções como o forEach precisa do :: ao invés do .

    }
}
