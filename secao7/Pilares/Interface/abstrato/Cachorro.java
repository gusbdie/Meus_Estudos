package secao7.Pilares.Interface.abstrato;

public class Cachorro extends Mamifero{

    //  public String mover(){
    //     return null;
    //  } não preciso definir pois ja fó instanciado na classe Mamifero
    
    public String mamar(){
        return null;
    }
    //sou obrigado a implementar pois ele é abstrato 
}
//se eu retirar o mover da classe Mamifero eu precisarei instanciar 
//neste classe tanto o mamar quanto o mover
