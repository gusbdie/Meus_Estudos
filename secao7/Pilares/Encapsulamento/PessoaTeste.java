package secao7.Pilares.Encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
    
        Pessoa p1 = new Pessoa(30);
        p1.setIdade(-30);

        System.out.println(p1.getIdade());
    
    }
}
