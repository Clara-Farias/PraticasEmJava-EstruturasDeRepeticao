//exercicio 3 / Slide: Seleção Múltipla - Repetição
package whilee;
import java.util.Scanner;
public class fatorial {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

    System.out.println("Digite um Número: ");
    int x = in.nextInt();   // Qualquer valor que queira calcular;
    int f = x;
    int fatorial = 0;
    do{
    
    f = f *(x-1);
    x--;
    fatorial = fatorial + f;
    System.out.println(f); // Aqui exibira o valor parcial do Fatorial, o seu último valor será o resultado do fatorial
    }

    while (x > 1);
    }
}