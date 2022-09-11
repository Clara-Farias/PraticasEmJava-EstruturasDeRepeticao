// Exercício 1 de Seleção Múltipla - Repetição

package switchh;
import java.util.Scanner;
public class semanas {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

    System.out.print("Olá Usuário, Vou te Recomendar uma Música!\n\n");

    System.out.print("[Segunda]\t[Terça]\t\t[Quarta]\t[Quinta]\t[Sexta]\t\t[Sábado]\t[Domingo]: \n\nInforme Qual Dia da Semana Você se Encontra: \n");
    String dia = in.nextLine();

    switch(dia){

        case "Segunda" : System.out.print("\nHoje é Segunda-Feira!!\nEscute:Lisa - Money\n"); break; // break serve para interromper o código a partir do case informado .(Sem ele seriam mostrados os resultados de todas as operações

        case "Terça": System.out.print("\nHoje é Terça-Feira!!\nEscute:BlackPink - Whistle\n"); break;
        
        case "Quarta": System.out.print("\nHoje é Quarta-Feira!!\nEscute:Inês Brasil - Undererê\n"); break;
        
        case "Quinta": System.out.print("\nHoje é Quinta-Feira!!\nEscute: Slipknot - Duality\n"); break;

        case "Sexta": System.out.print("\nHoje é Sexta-Feira!!\nEscute: Deolane Bezerra - Quem Paga Sou Eu\n"); break;
        
        case "Sábado": System.out.print("\nHoje é Sábado!!\nEscute: Hino da Yara 5 Minutos\n"); break;
        
        case "Domingo": System.out.print("\nHoje é Domingo!!\nEscute: Simple Plan - Perfect\n"); break;
        
        default: System.out.print("\nVish, Tá em Neutre!\n"); 
        }
    }
}