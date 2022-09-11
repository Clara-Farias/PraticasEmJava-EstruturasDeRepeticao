package revisao;
import java.util.Scanner;
public class Quest4 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];


    for(int i = 0; i < vetor1.length; i++){
        System.out.println("Digite o "+(i+1)+"° Número do Vetor 1 ->");
        vetor1[i] = in.nextInt();
    
    for(int j = 0; j < vetor2.length; j++){
        System.out.println("Digite o "+(j+1)+"° Número do Vetor 2 ->");
        vetor2[j] = in.nextInt();

            if(vetor1[i] == vetor2[j]){
            System.out.println("Os Números "+(i+1)+ "e"+(j+1)+"Se Repetem");
                }
            }
        }
    }
}
