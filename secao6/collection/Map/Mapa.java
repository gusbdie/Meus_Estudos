package secao6.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<Integer, String>();
        //não tem o add
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Roberto");// sobrepõe o que estava no primeiro index
        usuarios.put(2, "Claudio");

        System.out.println(usuarios.size());//vai ser 1
        System.out.println(usuarios.keySet());//{1,2}
        System.out.println(usuarios.values());//{Roberto, Claudio}
        System.out.println(usuarios.entrySet());//{1=Roberto, 2=Claudio}
    
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        // for(Entry<Integer, String> registro: usuarios.entrySet()){
        //     System.out.println(registro.getKey());
        //     System.out.println(registro.getValue());
        // }
    }
}
