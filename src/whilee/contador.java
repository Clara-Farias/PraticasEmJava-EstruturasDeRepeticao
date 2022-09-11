package whilee;
import java.util.Scanner;
public class contador {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
  
    boolean infinity = true;
	while(infinity){

    System.out.println("Digite um Número Maior que Zero e Menor que 100: ");
    int contador = in.nextInt();
    for(int i = contador; i < 100; i = i + 2){
	
    if(contador > 0 & contador < 100){
        System.out.println(i);
    }
            }
	    }
    }
}
