import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Exercíco 7 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número da soma,caso deseje sair digite um número negativo");
        double num1 = scanner.nextDouble();
        System.out.println("Informe o segundo número da soma,caso deseje sair digite um número negativo");
        double num2 = scanner.nextDouble();
  
        while(num2 >= 0 && num1 >= 0){
            double soma = num1 + num2;
            System.out.println("Resultado da soma é: " + soma);
        }
        scanner.close();
    }
}
