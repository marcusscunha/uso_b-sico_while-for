package aplicacao;

import java.util.Scanner;

public class uso_basico_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantia de vezes: ");
		int N = sc.nextInt();
		
		int soma=0;
		
		for(int i=0;i<N;i++) {
		System.out.println("Digite o valor: ");
			int x = sc.nextInt();
		
			soma=soma+x;
		}
		
		System.out.println("Valor total da soma: "+soma);
		
		sc.close();
	}

}
