//2. Crie um programa que peça 10 números ao usuário e depois calcule a sua soma e média aritmética.

package arrays;
import java.util.Scanner;
public class mediavetores {
static Scanner in = new Scanner(System.in);

public static void main(String[] args){
int media;
int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
System.out.println();
 
System.out.println("Digite 10 Números ");
num1 = in.nextInt();
num2 = in.nextInt();
num3 = in.nextInt();
num4 = in.nextInt();
num5 = in.nextInt();
num6 = in.nextInt();
num7 = in.nextInt();
num8 = in.nextInt();
num9 = in.nextInt();
num10 = in.nextInt();


media = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10 ;

System.out.println("A Média dos Valores Resultou em => "+media);
    }   
}
