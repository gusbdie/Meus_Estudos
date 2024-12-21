package secao6.collection.Stack;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {

    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("Vilão");//retorna booleano caso não adicione
        livros.push("Vingança");//retorna um erro caso não adicione
    
        System.out.println(livros.peek());//retorna nulo caso não haja nada
        //vai começar por Vingança pois como é uma pilha
        //o primeiro item é o último adicionado
        System.out.println(livros.peek());//retorna erro caso não haja nada

        System.out.println(livros.poll());//remove começando por Vingança
        //caso não haja nada retorna falso
        System.out.println(livros.remove());// = Syso(livros.pop());
        //caso não haja nada reotnra erro
        
    }
}
