package secao6.collection.equals;
public class UsuarioEquals {

    String nome;
    String email;

    public boolean equals(Object objeto){
        if(objeto instanceof UsuarioEquals && objeto != null){

            UsuarioEquals usuario = (UsuarioEquals) objeto;

            boolean nomeIgual = usuario.nome.equals(this.nome);
            boolean emailIgual = usuario.email.equals(this.email);
        
            return nomeIgual && emailIgual;
        }
        else
            return false;
    }
}
