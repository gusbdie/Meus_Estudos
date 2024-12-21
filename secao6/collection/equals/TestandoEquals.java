package secao6.collection.equals;

public class TestandoEquals {

    public static void main(String[] args) {
        
        UsuarioEquals u1 = new UsuarioEquals();
        u1.nome =" Gustavo";
        u1.email = "gustavo@gmail";

        UsuarioEquals u2 = new UsuarioEquals();
        u2.nome =" Gustavo";
        u2.email = "gustavo@gmail";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        
    }
}
