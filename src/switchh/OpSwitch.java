package switchh;
import java.util.Scanner;
public class OpSwitch {
static Scanner coleta = new Scanner(System.in);
   public static void main(String[] args) {

      boolean chave = true;
      while (chave) {
         double a, b;
         int menu; 
         
        
         System.out.println("(1) Soma");
         System.out.println("(2) Subtração");
         System.out.println("(3) Multiplicação");
         System.out.println("(4) Divisão");
         System.out.println("(5) Potenciação");
         System.out.println("(6) Radiciação");
         System.out.println("(7) ?");
         System.out.println("(8) Sair");
         System.out.println("\nEscolha a Operação => \n");
         coleta = new Scanner(System.in);
         menu = coleta.nextInt();      
        

         System.out.println("Digite o Primeiro valor => ");
         
         a = coleta.nextDouble();
         
         System.out.println("Digite o Primeiro Valor => ");
        coleta = new Scanner(System.in);       
         b = coleta.nextDouble();

        switch (menu) {
        case 1:
            somar(a,b); break;
        case 2:
            subtracao(a,b); break;
        case 3:
            multiplicar(a,b); break;
        case 4:
            divisao(a,b); break;
        case 5:
            potencia(a,b); break;
            case 8:
            System.out.println("Xau Maricona...");
            System.exit(1);
    
        default:
            chave = false;
            break;
       }
    }
  }

   public static void somar(double a, double b) {
    double c = a+b;
    System.out.println("\nVocê Escolheu Soma!\nResultado => "+c);
   }

   public static void subtracao(double a, double b) {
      double c = a-b;
    System.out.println("\nVocê Escolheu Subtração!\nResultado => "+c);
   }

   public static void multiplicar(double a, double b) {
      double c = a*b;
    System.out.println("\nVocê Escolheu Multiplicação!\nResultado => "+c);
   }

   public static void divisao(double a, double b) {
      double c = a/b;
    System.out.println("\nVocê Escolheu Divisão!\nResultado => "+c);
   }

  public static void potencia(double a, double b){

    double c = Math.pow (a, b);
    System.out.println("\nVocê Escolheu Potenciação!\nResultado => "+c);
    
  }
}