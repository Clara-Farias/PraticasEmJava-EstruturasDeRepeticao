//3- Faça um programa que leia 10 valores e os armazene em um vetor. Depois, imprima o vetor na ordem inversa.
package revisao;
import java.util.Scanner;
public class Quest3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int [] num = new int [10];
        
        for(int i = 0; i < num.length; i++){
            System.out.println("Digite o " + (i + 1 ) + "° Número => ");
            num[i] = in.nextInt();
            System.out.println();
            }
            for(int j = num.length - 1;j >=0; j--){
                System.out.println("Ordem Inversa "+(num[j]));
        }
    }  
}