package switchh;
import java.util.Scanner;
public class CPF {
public static Scanner entradaMenu = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("|             SEJA BEM-VINDO(A)            |");
        System.out.println("|_________________AO MENU!!________________|\n");
        System.out.println("    [1] - INFORMAÇÕES");
        System.out.println("    [2] - VALIDAR CPF");
        System.out.println("    [3] - SAIR\n");
        System.out.println("    Digite sua Escolha =>\n");
        int menu = entradaMenu.nextInt();    

        if (menu == 1) {
            informacoesdoDev();
        }
        if (menu == 2) {
            validarCpf();
        }
        if (menu == 3) {
            sairdoPrograma(); }   
        }

    public static void informacoesdoDev() { // dados do Usuário
        System.out.println("-----------------------------------------------------------");
        System.out.println("  Aluna ->       Clara Letícia Farias de Lima");
        System.out.println("  Disciplina ->  Lógica de Programação");
        System.out.println("  Curso ->       ADS(Análise e Desenvolvimento de Sistemas) ");
        System.out.println("  Matricula ->   1-2021221156");
        System.out.println("  Professor ->   Tiago\n");
        System.out.println("-----------------------------------------------------------");
        }

    public static void validarCpf() { // validador de CPF
        boolean novatentativa = true;
		do {
			Scanner entradaValidar = new Scanner(System.in);

		    System.out.println("\nDigite o Seu CPF => ");
            System.out.println("-----------------------------------------------------------");
		    String digitos9 = entradaValidar.nextLine();  //digitos9 = CPF sem código de Segurança
		   
		    if (cpfcorreto(digitos9)) { 
		    	if (tamanhodoCpf(digitos9)) {
		    		int blocoDigito_1 = 10;
				    int blocoDigito_2 = 11;
				    int digito1 = calcularDigitos(digitos9, blocoDigito_1);
				    String cpfComDigito1 = digitos9 + digito1;
				    int digito2 = calcularDigitos(cpfComDigito1, blocoDigito_2);
			        System.out.println("\n\nOs Digitos Verificadores São Respectivamente -> "  + digito1+digito2+"\nSeu CPF Completo >>> "   +digitos9 + digito1 + digito2);
                    System.out.println("-----------------------------------------------------------"); 
				    novatentativa = false;
			    }else {
			    	System.out.println("Digite Apenas 9 Dígitos...\nFaça Uma Nova Tentativa!");   
			    }
		    } else {
		    	System.out.println("CPF Incorrespondente com Requisitos!");    		      
		    }
		} while(novatentativa);
	}
    public static int calcularDigitos(String CPF, int confirmador) { 
	    int digitoTotal = 0;    
        for (int i = 0; i < CPF.length(); i++){
            char DigitoporDigito = CPF.charAt(i);
            if (confirmador > 1) {
                digitoTotal += Integer.parseInt(String.valueOf(DigitoporDigito)) * confirmador--;
            }
        }
    	int DivisaoResto = digitoTotal%11;
    	if (DivisaoResto < 2 ) {
    	    return 0;
    	} 
    	return 11 - DivisaoResto;
	}

    public static boolean cpfcorreto(String CPF) {
        return CPF.matches("[0-9]+");
    }
    public static boolean tamanhodoCpf(String CPF) { //Tamanho que o CPF deve ter pra continuar o código
	    return CPF.length() == 9;
	}  
        public static void sairdoPrograma() {
        System.out.println("O Programa Foi Encerrado..."); // fim do porgrama
        System.exit(1); 
    }
}