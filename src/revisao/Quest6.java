//6 - Faça um programa que leia um vetor de 10 elementos e em seguida ache a posição do elemento m (dado pelo usuário) no vetor. Caso o elemento não exista no vetor informe ao usuário.
package revisao;
import java.util.Scanner;
public class Quest6 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    int [] vetor = new int [10];
    
    for(int i = 0; i < vetor.length; i++){
       System.out.print("Digite o Valor da Posição "+(i+1)+" ->");
        vetor[i] = in.nextInt();
        System.out.println();
        }

        System.out.print("\nDigite o Valor do Elemento M -> \n");
        int m = in.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(m == vetor[i]){
                System.out.print("O Elemento "+m+" se Encontra na Posição "+(i+1)+"\n"); 
            }
            if(m !=vetor[i]){
                System.out.println("Não Existe!");break;
            }
        }
    }
}
