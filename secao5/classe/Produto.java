package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;  

    public Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;

    }
    public double getDesconto(){
        return desconto;
    }
    public double getPreco(){
        return preco;
    }
}
