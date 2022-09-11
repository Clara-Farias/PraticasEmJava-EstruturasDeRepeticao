package whilee;
import java.util.Scanner;
public class soma {
static Scanner in = new Scanner(System.in);

public static void main(String[] args){

int num = 0;

do {
    num = 0;
    int produto = 0;
    int soma = 0;
    System.out.println("Digite um Número -> ");
    num = in.nextInt();

    for (int i = 1; i <= num; i++){
        produto = i*i;
        soma = soma + produto;
        System.out.println(produto+ " ");
    }

    System.out.println();
    System.out.println("A soma dos produtos é igual a "+soma);
}

while(num >=0);

    }
}