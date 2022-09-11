package arrays;
import java.util.Scanner;
public class ArraysDiretaInversa {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

    int i,j,menu;
    boolean b = true;
    int [] vetor = {1,2,3,4,5,6,7,8,9,10};

    while(b){
    // menu
    System.out.println("|----------------------|MENU|----------------------|");
    System.out.println();
    System.out.println("\t\t   Olá, Usuário!!\n");
    System.out.println("\n1 - Vetores -  Direta\n2 - Vetores -  Inversa\n3 - Fechar Menu\n\nDigite uma das Opções => ");
    menu = input.nextInt();

    // opções
    if(menu == 1){
    for(i = 0; i < vetor.length; i++){
        System.out.println("Ordem Direta " +(vetor[i]));
        }
    }

    if(menu == 2){
    for(j = vetor.length - 1; j >= 0; j--){
    System.out.println("Ordem Inversa " +(vetor[j]));
        }
    }

    if(menu == 3){
        System.out.println("Programa Encerrado...");
        System.exit(1);

            }
        }
    }
}