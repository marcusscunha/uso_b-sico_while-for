package aplicacao;

import java.util.Scanner;

public class diferenca_numerica_com_soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Acerte o valor de 'X'");
		long x = sc.nextLong();
		long soma = 0;
		while(x!=0) {  
			soma=soma+x;
			x=sc.nextLong();
		}
		System.out.println("Muito bem, voc� acertou: "+x+" � valor de 'X'");
		System.out.println("A soma de todos os outros n�meros digitados �: "+soma);
		sc.close();
	}

}
