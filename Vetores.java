package eitas;
import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int[] vetor = {1,2,3,4,5};

        for(int i = 0; i < vetor.length ; i++){
        System.out.println("Digite um Valor");
        vetor[i] = in.nextInt();
        System.out.println("Vetor ["+i+"]="+vetor[i]);
        }
    }
}
