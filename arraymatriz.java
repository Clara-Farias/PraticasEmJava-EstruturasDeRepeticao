package eitas;
import java.util.Scanner;
public class arraymatriz {
static Scanner in = new Scanner(System.in);
public static void main(String[] args){

    int matriz[][] = new int [3][2];

    
    for (int i = 0; i < 3; i++){
        System.out.println();
        for (int j = 0; j < 2 ; j++){
            System.out.println("Insira o valor da linha ["+i+"] e da coluna ["+j+"]" );
            matriz[i][j] = in.nextInt();
        }
    }

    for (int i = 0; i < 3; i++){
        System.out.println();
        for (int j = 0; j < 2 ; j++){
            if (matriz [i][j] %2== 1){
            System.out.println("--> " + matriz[i][j]); }
        }
    }
}
}