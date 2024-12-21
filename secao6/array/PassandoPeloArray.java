package secao6.array;

public class PassandoPeloArray {

    public static void main(String[] args) {
        double[] NotasAluno = new double[2];
        NotasAluno[0] = 8.2;
        NotasAluno[1] = 7.8;

        double totalAluno = 0;
        for(int i = 0; i < NotasAluno.length; i++){
            totalAluno += NotasAluno[i];
        }
        System.out.println("A média do aluno é: " + totalAluno / NotasAluno.length);
    
        // FOREACH (passa por todo array)

        double[] NotasAluno2 = {1.2, 1.4, 1.6};

        for(double nota: NotasAluno2){
            System.out.println(nota);
        }
    }
}
