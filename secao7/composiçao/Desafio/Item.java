package secao7.composiçao.Desafio;
//quantidade vai estar presente aqui
//classe do tipo produto também
public class Item {

    int quant;
    Produto produto;
    double total;

    public Item(int quant, Produto produto){
        this.quant = quant;
        this.produto = produto;
        total = this.quant * produto.preco;
    }
}
