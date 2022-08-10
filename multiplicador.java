package defaults;

import java.util.Scanner;

public class multiplicador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			
			int produto = i * N;

			System.out.println(i + "x" + N + "= "+produto);
		}

		sc.close();
	}

}
