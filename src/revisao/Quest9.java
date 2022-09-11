// 9 - Faça um programa que leia um vetor com 20 elementos. A seguir, troque o primeiro elemento com o último, o segundo com o penúltimo, etc, até o décimo com o décimo primeiro.
package revisao;
import java.util.Scanner;
public class Quest9 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int [] vetor = new int[20];

        for(int i = 0; i < vetor.length;i++){
            System.out.println("\nDigite o "+(i+1)+" ° Elemento ->\n");
            vetor[i] = in.nextInt();
        }
        for(int j = vetor.length - 1; j >= 0; j--){
        System.out.println("\nVetores -> "+vetor[j]);
        }
    }
}
