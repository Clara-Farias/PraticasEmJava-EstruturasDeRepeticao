package arrays;
import java.util.Scanner;
public class SomaVetor {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        int [] vetor = new int [10];
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " +( i + 1)+ "° Número => ");
            vetor[i] = in.nextInt();
        }
        double soma = 0;
        for (double n : vetor) {
            soma = soma + n;
        }
        System.out.println("A Soma dos Vetores Resultou Em => " +soma);
    }   
}
