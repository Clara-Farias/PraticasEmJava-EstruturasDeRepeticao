// exemplo /Slide : Seleção Múltipla - Repetição
package whilee;
import java.util.Scanner;
public class produto {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
  
    boolean b = true;

    while(b){
    System.out.println("\t\tOlá, Usuário!");
    System.out.println();
    System.out.println("|...................Menu....................|");
    System.out.println("1- Calcular Produto\n2 - Sair do Menu\n");
    int menu = in.nextInt();
    

    if(menu == 1){
    System.out.print("\n\nDigite o Primeiro Valor => \n");
    int x = in.nextInt();
    System.out.println("Digite o Segundo Valor => ");
    int y = in.nextInt();

    int resposta = 0;
    while ( y > 0) {
    b = true;
    resposta = resposta + x;
    y = y - 1;
    }
    System.out.print("\nO Produto dos Valores é de => "+resposta+ "\n\n");
            }
    
    if(menu == 2){
        System.out.println("\nVocê Saiu do Menu...");  
        System.exit(1);
            }
        }
    }
}