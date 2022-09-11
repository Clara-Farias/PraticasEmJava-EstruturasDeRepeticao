package switchh;
import java.util.Arrays;
public class desafiolp {
    public static void main(String[] args) {

    long maior1,maior2,maior3,maior4,menor1,menor2,menor3,menor4,somamaior,somamenor;
    long [] vetor = {256741038,623958417,467905213,714532089,938071625};
        
    Arrays.sort(vetor);
    maior1 = vetor[4];
    maior2 = vetor[3];
    maior3 = vetor[2];
    maior4 = vetor[1];
    
    menor1 = vetor[0];
    menor2 = vetor[1];
    menor3 = vetor[2];
    menor4 = vetor[3];

    System.out.println("Maiores -> "+maior1+","+maior2+","+maior3+","+maior4);
    System.out.println("Menores -> "+menor1+","+menor2+","+menor3+","+menor4);

    somamaior = maior1 + maior2 + maior3 + maior4;
    somamenor = menor1 + menor2 + menor3 + menor4;

    System.out.println("\nMaior Valor -> " +somamaior);
    System.out.println("Menor Valor -> " +somamenor);
    }
}