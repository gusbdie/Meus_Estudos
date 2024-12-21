package secao7.Pilares.Encapsulamento;

public class Pessoa {

    private int idade;

    public Pessoa(int idade){
        setIdade(idade); // impossibilita criar uma pessoa com idade negativa
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if(novaIdade >= 0 && novaIdade <= 120){
        this.idade = novaIdade;
        }
    }
}
