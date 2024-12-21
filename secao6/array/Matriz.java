package secao6.array;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Quanto alunos a turma possui?");
        int quantAlunos = scanner.nextInt();

        System.out.println("Quantas notas cada aluno tem?");
        int quantNotas = scanner.nextInt();

        double[] [] notasDaTurma = new double [quantAlunos] [quantNotas];

        double total = 0;
        for(int i = 0; i<notasDaTurma.length; i++){
            for(int j = 0; j< notasDaTurma[i].length; j++){
                System.out.println("Qual é a nota " + (j+1) + " do aluno " + (i+1));
                notasDaTurma[i][j] = scanner.nextDouble();
                total += notasDaTurma[i][j]; 
            }
        }

        double media = total / (quantAlunos * quantNotas);
        System.out.println("A média final da turma foi: " + media);

        scanner.close();
    }
}
