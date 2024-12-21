package secao6.collection.hashSet;

import java.util.TreeSet;
import java.util.Set;

public class ConjuntoComportado {

    public static void main(String[] args) {
        
        Set<String> listaAprovados = new TreeSet<>();// se não tiver esse segundo<> ele pode aceitar qualquer valor ainda
        listaAprovados.add("Ana");
        listaAprovados.add("Guga");

        for(String candidato: listaAprovados){
            System.out.println(candidato); 
            //a impressão vai ser em ordem aleatória
        
            // para que ele imprima na ordem que eu desejo
            // eu devo utilizar ao invés de HashSet, usar o 
            // TREESET --> Set<String> listaAprovados = new TreeSet<>();
            // SortedSet no lugar do Set também serve!!!
        }
    }
}
