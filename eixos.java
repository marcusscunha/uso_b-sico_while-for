package aplicacao;

import java.util.Scanner;

public class eixos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite os valores");
		System.out.println("X:");
		double x = sc.nextDouble();
		System.out.println("Y:");
		double y = sc.nextDouble();

while (x!=0 || y!=0)	{	
	if (x == 0.0 && y==0.0) System.out.println("Origem");
	else if (x==0.0) System.out.println("Eixo Y");
	else if (y==0.0) System.out.println("Eixo X");
	else if (x>0.0&&y>0.0)System.out.println("Q1");
	else if (x<0.0&&y>0.0)System.out.println("Q2");
	else if (x<0.0&&y<0.0)System.out.println("Q3");
	else System.out.println("Q4");
 x=sc.nextDouble();
 y=sc.nextDouble();
}
		
		
		
		
		
		
		
		sc.close();
	}

}
