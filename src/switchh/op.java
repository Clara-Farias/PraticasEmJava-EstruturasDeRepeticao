// Exercício 1 de Seleção Múltipla - Repetição

package switchh;
import java.util.Scanner;
public class op {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

    int num1, num2, r; //num1 num2 para declaração de valores; r = resultado
    char op; // Para Selecionar Operação

    System.out.print("Olá Usuário!\nInforme a Operação que Deseja Execultar Logo Abaixo:\n ");

    System.out.print("\n[+] Soma\t[-] Subtração\t[/] Divisão\t[*] Multiplicação: \n\nQual Operação Deseja Execultar?: \n");
    op = in.next().charAt(0);
 
    System.out.print("Digite o Primeiro Número: ");
    num1 = in.nextInt();

    System.out.print("Digite o Segundo Número: ");
    num2 = in.nextInt();

    switch(op){

        case '+':
        r = num1 + num2;
        System.out.print("\nVocê Escolheu Soma!\n");
        System.out.print("\nO Resultado da Operação Foi: "+r+"\n");
        break; // break serve para interromper o código a partir do case informado .(Sem ele seriam mostrados os resultados de todas as operações)
        

        case '-':
        r = num1 - num2;
        System.out.print("\nVocê Escolheu Subtração!\n");
        System.out.print("\nO Resultado da Operação Foi: "+r+"\n");
        break;
        

        case '/':
        r = num1 / num2;
        System.out.print("\nVocê Escolheu Divisão!\n");
        System.out.print("\nO Resultado da Operação Foi: "+r+"\n");
        break;
    
        case '*':
        r = num1 * num2;
        System.out.print("\nVocê Escolheu Multiplicação!\n");
        System.out.print("\nO Resultado da Operação Foi: "+r+"\n");
        break;
        
        default: 
        System.out.print("\nNão Foi Possível Realizar a Operação!!\n");
        break;
        }
    }
}