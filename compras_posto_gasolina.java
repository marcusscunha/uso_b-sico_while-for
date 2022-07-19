package aplicacao;

import java.util.Scanner;

public class compras_posto_gasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite os códigos: ");
		
		int gasolina=0;
		int alcool=0;
		int disel=0;
		int outros=0;
		int codigo = sc.nextInt();
		
		
		
		while (codigo!=4) {
		
			if (codigo==1)
		gasolina=gasolina+1;
		
		else if (codigo==2)
		alcool=alcool+1;
		
		else if (codigo==3)
		disel=disel+1;
		
		else
		outros=outros+1;
			
		
		
		
		
		
		
		
		codigo=sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Alcool: "+alcool);
		System.out.println("Disel: "+disel);
		System.out.println("Outros: "+outros);
		sc.close();
	}

}
