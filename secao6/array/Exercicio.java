package secao6.array;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        double[] notasA = new double[2];

        notasA[0] = 7.0;
        notasA[1] = 7.0;

        //OU

        //double[] notas = {5.5, 7.7};
        
        System.out.println(notasA[notasA.length - 1]);
        //para printar a última casa do array
        System.out.println(Arrays.toString(notasA));
    }
}
