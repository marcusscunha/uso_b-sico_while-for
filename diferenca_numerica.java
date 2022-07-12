package aplicacao;

import java.util.Scanner;

public class diferenca_numerica {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Acerte o valor de 'X'");
		long x = sc.nextLong();
		
		while(x!=0)  
			x=sc.nextLong();
		System.out.println("Muito bem, você acertou: "+x+" É valor de 'X'");
		
		sc.close();
	}

}
