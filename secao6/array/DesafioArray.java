package secao6.array;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você irá fornecer?");
        
        int quantNotas = scanner.nextInt();
        double[] notas = new double[quantNotas];

        for(int i=0; i<notas.length; i++){
            System.out.println("Digite qual foi a nota " + (i+1) + ": ");
            double notasDoAluno = scanner.nextDouble();
            notas[i] = notasDoAluno;
        }
        double soma = 0;
        for(double nota: notas){
            soma += nota;
        }

        System.out.println("A média do aluno foi: " + (soma / notas.length));
        scanner.close();
    }
}
