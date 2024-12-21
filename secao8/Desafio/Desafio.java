import java.util.function.Function;
import java.util.function.UnaryOperator;

import Predicate.Produto;

public class Desafio {

    public static void main(String[] args) {
        
        Produto p = new Produto("Ipad", 3000.00, 0.1);

         Function<Produto, Double> valorFinal = p1 -> (p1.preco * (1 - p1.desconto));
         System.out.println(valorFinal.apply(p));
         
         UnaryOperator<Double> precoImposto = preco -> (preco * (1 + 0.085));
         UnaryOperator<Double> precoFreteLongo = preco -> (preco + 100);
         UnaryOperator<Double> precoFreteCurto = preco -> (preco + 50);

         if(valorFinal.apply(p) >= 2500){
            p.preco = valorFinal.andThen(precoImposto).apply(p);
         }

         if(valorFinal.apply(p) >= 3000){
            p.preco = precoFreteLongo.apply(p.preco);
         }else{
            p.preco = precoFreteCurto.apply(p.preco);
         }
         System.out.println("O valor final é: " + String.format("%.2f", p.preco));
      }
      //caso queira usar String.format("%.2f", valor) e retorna um double só fazer
      //Double.parseDouble(String.format(("%.2f", valor)));
}
// A partir do produto calcular o preço real (com desconto)
// Imposto Municipal: >= 2500 (8,5%) / <2500 (Isento)
// Frete >= 3000 (100) / < 300 (50)
// Arredondar: Deixar duas casas decimais
// Formatar: R$1234,56 
