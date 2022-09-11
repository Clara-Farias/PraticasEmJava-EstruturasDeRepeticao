// 8 - Faça um programa que carregue um vetor com dez números reais, calcule e mostre a quantidade de números negativos e a soma dos números positivos desse vetor.
package revisao;
import java.util.Scanner;
public class Quest8 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        

        double [] vetor = new double [10];
        double soma = 0, negativo = 0;
        for(int i = 0; i < vetor.length;i++){
            System.out.println("Digite o "+(i+1)+"° Valor -> ");
            vetor[i] = in.nextDouble();
       
        if (vetor[i] < 0){
           negativo++;
        }
        if (vetor[i]>= 0){
            soma += vetor[i];
            }
        }
        System.out.println("O Resultado da Soma = "+soma+ "\nExistem "+negativo+" Números Negativos!");
    }
}   