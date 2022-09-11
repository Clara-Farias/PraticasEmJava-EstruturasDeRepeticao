// 5 - Faça um programa que carregue um vetor com sete números inteiros, calcule e mostre: a. Os números múltiplos de 2;
//b. Os números múltiplos de 3; c. Os números múltiplos de 2 e de 3.
package revisao;
import java.util.Scanner;
public class Quest5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    int [] vetor = new int [7];
    
    for(int i = 0; i < vetor.length; i++){
        System.out.println("Digite o "+(i+1)+"° Valor => \n");
        vetor[i] = in.nextInt();
            }
        for(int m = 0; m < vetor.length; m++)

        if(vetor[m]%2==0){
        System.out.println(vetor[m]+" É Múltiplo de 2");

        if(vetor[m]%3==0){
        System.out.println(vetor[m]+" É Múltiplo de 3");
        }

        if(vetor[m]%3==0 && vetor[m]%2==0){
        System.out.println(vetor[m]+" É Múltiplo de 2 e 3");
            }
        }
    }
}
