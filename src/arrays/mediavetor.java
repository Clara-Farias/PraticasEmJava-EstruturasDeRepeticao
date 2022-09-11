package arrays;
import java.util.Scanner;
public class mediavetor {
static Scanner in = new Scanner(System.in);

public static void main(String[] args){
    double soma = 0;

    double [] numeros = new double[10];
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Digite o " +(i + 1)+ "º Valor => "); // obs = (i+1) 0 + 1 = 1 Para inicar do Valor 1;
        numeros[i] = in.nextDouble();
    }
    for (double n : numeros) {
        soma = soma + n;  // OU soma += n; Dão no mesmo resultado!
    }
    System.out.println("O Resultado da Soma => " +soma);
    System.out.println("O Resultado da Média => " +soma/10);
    }
}