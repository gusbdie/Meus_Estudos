package secao7.composiçao.UmPraMuitos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;// o item recebido já é direcionado para o compra da classe Item
        //lembrando que o this serve para se referir a variável da classe que ele está presente
        //logo esse this esta referenciando o item desta classe
    }


    double getValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
