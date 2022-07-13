package aplicacao;

import java.util.Scanner;

public class numeros_crescente_decrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite os números:");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x!=y) {
		if (x<y) System.out.println("Crescente");
		
		else System.out.println("Decrescente");
		
		x = sc.nextInt();
		y = sc.nextInt();
		}
		sc.close();
	}

}
