// 2- Faça um programa que leia 10 valores e os armazene em um vetor. Depois, o programa deve somar todos os valores do vetor e apresentar o resultado
package revisao;
import java.util.Scanner;;
public class Quest2 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    int [] vetor = new int [10];
    int soma = 0;

    for(int i = 0; i < vetor.length; i++){
        System.out.println("Digite o "+(i+1)+ "° Valor => ");
        vetor [i] = in.nextInt();
    }
    for(int n : vetor){
    soma = soma + n; // ou soma = soma + n
    }
    
    System.out.println("O Resultado da Soma é => "+soma);
    }
}