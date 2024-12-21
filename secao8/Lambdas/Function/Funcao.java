package Function;

import java.util.function.Function;

//recebe um parâmetro de um tipo e retorna um que pode ser de outro tipo
public class Funcao {

    public static void main(String[] args) {
        
    Function<Integer, String> parOuImpar = 
            numero -> numero % 2 == 0 ? "Par" : "Impar";

    System.out.println(parOuImpar.apply(32));

    Function<String, String> empolgado = valor -> valor + "!!!";
    
    Function<String, String>oResultadoE = 
            valor -> "O resultado é: " + valor;
    
    String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
    //andThen => "e então" serve para juntar duas funções
    //deu certo pois o resultado dá primeira função é uma String 

    System.out.println(resultadoFinal);
    }
}
