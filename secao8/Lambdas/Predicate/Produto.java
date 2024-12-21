package Predicate;

public class Produto {

    //era final mas coloquei public para poder usar no "Consumer"
    public String nome;
    public double preco;
    public double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;    
    }

    @Override
    public String toString() {
        return "R$" + preco;
    }
}

