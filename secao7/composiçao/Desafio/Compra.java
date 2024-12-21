package secao7.composiçao.Desafio;

import java.util.ArrayList;

//lista de itens
public class Compra {

    ArrayList<Item> itens = new ArrayList<Item>();

    public Compra(Item item, Item item2){
        itens.add(item);
        itens.add(item2);
    }
}
