package secao7.composiçao.Desafio;
//criar duas compras cada uma com dois itens e cada item associado 
//a produto diferente

public class ClienteTeste {
    public static void main(String[] args) {
        
    Produto p1 = new Produto("Cenoura", 10);
    Produto p2 = new Produto("Maçã", 10);
    Produto p3 = new Produto("Uva", 10);
    Produto p4 = new Produto("Pera", 10);

    Item i1 = new Item(2, p1);
    Item i2 = new Item(1, p2);
    Item i3 = new Item(2, p3);
    Item i4 = new Item(2, p4);

    Compra c1 = new Compra(i1, i2);
    Compra c2 = new Compra(i3, i4);

    Cliente cliente1 = new Cliente("Gustavo", c1);
    Cliente cliente2 = new Cliente("Ricardo", c2);

    System.out.println(cliente1.obterValorTotal());
    System.out.println(cliente2.obterValorTotal());

    }
}
