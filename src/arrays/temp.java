//3. Crie um programa que peça 10 temperaturas de uma cidade e ao final exiba a maior e menor temperatura da sequência dada.

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class temp {
static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double[] array = new double[10];
        double menorTemp, maiorTemp;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º Temperatura "); 
            array[i] = in.nextDouble();
        }

        Arrays.sort(array); //  ordena do menor para o maior
        
        maiorTemp=array[9]; //o maior valor fica na última posição
        menorTemp=array[0]; // e o menor na primeira
        
        System.out.println("Maior Temperatura = "+maiorTemp+"°C"+"\nMenor Temperatura= "+menorTemp+"°C ");
    }
}