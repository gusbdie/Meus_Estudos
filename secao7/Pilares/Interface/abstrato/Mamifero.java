package secao7.Pilares.Interface.abstrato;

public abstract class Mamifero extends Animal{

    public String mover(){
        return "Com as patas";
    }
    // por mover está aqui, sua subclasses tem a opção de implementa-la
    // e não a obrigação
    public abstract String mamar();
}
