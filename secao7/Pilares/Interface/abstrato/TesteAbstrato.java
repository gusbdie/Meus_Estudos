package secao7.Pilares.Interface.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        
        Mamifero a = new Cachorro();
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());
    }
    //se fosse animal a não conseguiria mamar
}
