package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Gustavo", 10.00, 0.1);
        
        double precoFinal = p1.getPreco() * (1 - p1.getDesconto());
        System.out.println(precoFinal);
    }
}
