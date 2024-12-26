import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println(7 / entrada.nextInt());
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }finally{ //vai entrar aqui independente de ir pro catch ou não
            entrada.close();
        }

        System.out.println("FIM");
    }

}
