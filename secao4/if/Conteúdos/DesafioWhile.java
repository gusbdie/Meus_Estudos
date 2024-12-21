import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double valorTotalNotas = 0;
        int contadorNotas = 0;
        do{
            System.out.println("Qual foi a nota?");
            nota = scanner.nextInt();
            if(nota >= 0 && nota <= 10){
                contadorNotas ++;
                valorTotalNotas += nota;
            }
        }while(nota != -1);
        
        double mediaNotas = valorTotalNotas / contadorNotas;
        System.out.println("A média total da nota dos aluno foi: " + mediaNotas);
       
        scanner.close();
    }
}
