package secao6.collection.list;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args){
        ArrayList<Usuario> lista = new ArrayList<>();
        
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Guga"));
        lista.add(new Usuario("Nick"));

        lista.remove(new Usuario("Nick"));

        for(Usuario u: lista){
            System.out.println(u.nome);// vai imprimir em ordem
        }

        System.out.println(lista.get(2));
    }
}
