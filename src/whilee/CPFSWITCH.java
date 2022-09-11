package whilee;
import java.util.Scanner;
public class CPFSWITCH {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("------------------- Escolha uma opcao -------------------");
        System.out.println("1. Verificar o dígito verificador do CPF");
        System.out.println("2. Informações do desenvolvedor");
        System.out.println("3. Sair do algoritmo");
        int opcaoDoMenu = input.nextInt();    
        switch (opcaoDoMenu) {
            case 1:
                validarCpf();
                break;
            case 2:
                informacoesDoDev();
                break;
            case 3:
                System.out.println("Opcao 3 escolhida. Saindo do algoritmo...");        
                break;
        }
	}
	
	static void informacoesDoDev() {
	    System.out.println("Aluna: Clara Letícia Farias de Lima");
        System.out.println("Matrícula: 1-2021112256");
	}
	
	static void validarCpf() {
		boolean tentarNovamente = true;
		do {
			Scanner input = new Scanner(System.in);
		    System.out.println("Digite o Seu CPF -> \n");
		    String cpf = input.nextLine(); 
		   
		    if (cpfValido(cpf)) {
		    	if (tamanhoValido(cpf)) {
		    		int fator_digito_1 = 10;
				    int fator_digito_2 = 11;
				    int digit1 = calcularDigitoVerificador(cpf, fator_digito_1);
				    String cpfComDigito1 = cpf + digit1;
				    int digit2 = calcularDigitoVerificador(cpfComDigito1, fator_digito_2);
			        System.out.println("Dígito verificador 1: "  +digit1); 
			        System.out.println("Dígito verificador 2: "  +digit2); 
				    System.out.println("Seu CPF final é >>> "  + cpf + digit1 + digit2);
				    tentarNovamente = false;
			    }else {
			    	 System.out.println("Apenas os 9 Primeiros Dígitos do seu CPF!!\nTente Novamente...");   
			    }
		        
		    } else {
		    	System.out.println("CPF inválido!");    		      
		    }
		    
		} while(tentarNovamente);
	    
	}
	
	static boolean tamanhoValido(String cpf) {
	    return cpf.length() == 9;
	}
	
	static boolean cpfValido(String cpf) {
	   return cpf.matches("[0-9]+");
	}
	
	static int calcularDigitoVerificador(String cpf, int fator) {
	    int total = 0;
        for (int i = 0; i < cpf.length(); i++){
            char cadaNumero = cpf.charAt(i);
            if (fator > 1) {
                total += Integer.parseInt(String.valueOf(cadaNumero)) * fator--;
            }
        }
    	int restoDaDivisao = total%11;
    	if (restoDaDivisao < 2 ) {
    	    return 0;
    	} 
    	return 11 - restoDaDivisao;
	}
}