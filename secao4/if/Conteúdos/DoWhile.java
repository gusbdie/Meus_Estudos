//crtl + espaço no scanner = puxa o import do scanner
//crtl + : = transforma o código em comentário

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String texto = "";

        do{
            System.out.println("Digite as palavras mágicas:");
            texto = scanner.nextLine();
        } while(!texto.equalsIgnoreCase("Por favor"));

        scanner.close();
    }
}
