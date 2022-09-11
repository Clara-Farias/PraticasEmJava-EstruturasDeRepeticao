package forr;
import java.util.Scanner;
public class fatoriallFor {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int num, fatorial;

        do{
        fatorial = 1;
        System.out.println("Digite um Número -> \n");
        num = in.nextInt();

        for(int i = 1; i <= num; i++){
            fatorial = fatorial * i;
        } 
        System.out.println("-> "+fatorial);

        }while(num > 0);

    
    }
}
