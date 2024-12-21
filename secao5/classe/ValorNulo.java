package classe;

public class ValorNulo {

    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        // String s2 = null;
        // System.out.println(s2.concat("???"));
        // vai dar errado porque estou tentando acessar
        // uma variável nula

        // caso não tenha certeza se haverá algum nulo no 
        // código, faz isso pra ter certeza que só ocorrerá caso
        // não haja um nulo
        if(s1 != null){
            s1 = "oiee";
        }
    }
}
