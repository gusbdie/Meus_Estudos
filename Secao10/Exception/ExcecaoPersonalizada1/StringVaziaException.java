package Secao10.Exception.ExcecaoPersonalizada1;

//aqui a excecao é não checada

@SuppressWarnings("serial") //precisa disso por extender o RuntimeException
public class StringVaziaException extends RuntimeException{

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está vazio", 
                nomeDoAtributo);
    }
}
