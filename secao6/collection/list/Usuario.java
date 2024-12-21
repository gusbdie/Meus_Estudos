package secao6.collection.list;

public class Usuario {
    String nome;

    public Usuario(String nome){
        this.nome = nome;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode()); 
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
           return true;
        if(obj == null)
           return false;
        if(getClass() != obj.getClass())
           return false;
        Usuario outro = (Usuario) obj;
        if (nome == null){
            if(outro.nome != null)
               return false;
        }else if (!nome.equals(outro.nome))
            return false;
        return true;
    }
    //outro método seria
    //public boolean equals(Object obj){
    //Usuario outroUsuario = (Usuario) obj;
    //return this.nome.equals(outroUsuario.nome);
    //}

    
}
