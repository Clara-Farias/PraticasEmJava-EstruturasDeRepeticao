package forr;
import java.util.Scanner;
public class impares {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Olá Usuário!!");
        boolean b = true;
    

        while(b){
        System.out.println("\nDigite um Número para Ver Seus Valores ímpares em Sequência: \n");
        int j = in.nextInt();
        
        for (int i = j; i < 50; i++) {
                
                if(i % 2 != 0) {
                    System.out.println("ímpares " +i);
                
                }
            }
        }
    }
}