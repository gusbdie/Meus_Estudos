package secao7.composiçao.Desafio;
// precisa informar quanto
//o cliente gastou na loja
//vai ter nome e lista de Compra e método obterValorTotal

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<Compra>();

    public Cliente(String nome, Compra compra){
        this.nome = nome;
        compras.add(compra);
    }
    double obterValorTotal(){
        double valorFinal = 0;
        for(Compra compra: this.compras){
            for(Item item: compra.itens){
                valorFinal += item.total;
            }
            
        }
        return valorFinal;
    }
}