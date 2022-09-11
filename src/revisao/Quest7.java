//7 -  Faça um programa que calcule a soma dos vetores, elemento a elemento, em um terceiro vetor. O tamanho do vetor deverá ser 4.
package revisao;
import java.util.Scanner;
public class Quest7 {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
    int [] vetor = new int [3];
    
    for(int i = 0; i < vetor.length; i++){
        System.out.println("Digite o Valor da Posição "+(i+1)+" ->");
        vetor[i] = in.nextInt();
        System.out.println();
        }

    

    int soma = 0;
    for (int n : vetor){
        soma += n;
        




    }
    }
}
