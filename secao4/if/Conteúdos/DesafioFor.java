public class DesafioFor {
    public static void main(String[] args) {
        
        String valor = "#";
        for(int i = 0; i < 5; i++){
            System.out.println(valor);
            valor += "#";
        }

        // agora sem utilizar valor número 

        for(String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }

    }
}
