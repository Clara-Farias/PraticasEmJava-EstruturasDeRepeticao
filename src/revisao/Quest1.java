//1- Escreva um programa que leia 20 valores inteiros e os armazene em um vetor. Depois de ler os 20 valores, o programa deve percorrer o vetor e mostrar na tela apenas os números pares que foram armazenados.
package revisao;
import java.util.Scanner;
public class Quest1 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int [] num = new int [20];
        
        for(int i = 0; i < num.length; i++){
            System.out.println("Digite o " + ( i + 1) + "° Número => ");
            num[i] = in.nextInt();
            System.out.println();
            }
        
        for(int j = 0; j < num.length;j++){
            if(num[j]%2==0){   
            System.out.println(num[j]+" É Um Número Par!!");
            }
        }
    }  
}