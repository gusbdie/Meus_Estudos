package Secao10.Exception.ExcecaoPersonalizada2;

//aqui a excecao é checada

@SuppressWarnings("serial") //precisa disso por extender o RuntimeException
public class NumeroForaDoIntervaloException extends Exception{

    private String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está negativo", 
                nomeDoAtributo);
    }
}
