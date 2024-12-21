package secao7.composiçao.UmPraMuitos;

public class CompraTeste {

    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.cliente = "João";
        compra1.adicionarItem(new Item("Caneta", 10 , 5));
        compra1.adicionarItem(new Item("Caderno", 1, 10));

        System.out.println(compra1.itens.size());//2
        System.out.println(compra1.getValorTotal());

        //somente demonstra a relação bidimensional
        compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
    }
}
