package arrays;
import java.util.Scanner;
public class InversaoString {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

    while(true){

        System.out.println("Digite uma Palavra = > ");
        String str = in.nextLine();
    
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println("No Reverso Será =>> " +str);
    
        }
    }
}
