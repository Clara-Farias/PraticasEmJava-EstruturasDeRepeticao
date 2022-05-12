package eitas;
import java.util.Scanner;
public class array4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    

    int [] vetor = {1,2,3,4,5};
    
     for(int i = 0;i < vetor.length; i = i++){
       
    if( i%2== 1){
        System.out.println("Pares: " +vetor[i]);
            }
        }
    }
}
