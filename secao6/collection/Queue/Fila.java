package secao6.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;


public class Fila {

    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<String>();//pode ou não ter esse segundo "String"
    
        fila.add("Ana");
        fila.offer("Bia");
        //diferença é que o add dá erro caso não consiga inserir
        //e o offer somente resulta false caso não consiga adicionar

        System.out.println(fila.peek());//pega o primeiro elemento da fila sem remover
        System.out.println(fila.element());//faz a mesma coisa
    
        //se a fila está vazia
        //.peek apresentará null 
        //.element apresentará erro

        fila.isEmpty(); //para saber se elá está vazia
        fila.poll(); //pega o primeiro elemento da fila e depois remove ele
        fila.remove();

        //sea fila está vazia
        //.poll retorna false
        //.remove retorna erro
    }
}
