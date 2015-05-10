import java.util.Scanner;

public class ParImpar {

	
	public static void main (String [] args ) {
		
		int a;
		
		System.out.println ("");
		
		System.out.println("Programa Para Saber Si Un Número Es Par o Impar");
		System.out.println("");
		
		Scanner  entrada = new Scanner (System.in);
		
		System.out.println("Ingrese un número");
		a= entrada.nextInt();

		if (a>0 && a%2 ==0 ) System.out.println("Positivo y Par");
		else
			if (a>0 && a%2 !=0 ) System.out.println("Positivo e Impar");
			else
				if (a<0 && a%2 ==0 ) System.out.println("Negativo y Par");
				else
					if (a<0 && a%2 !=0 ) System.out.println("Negativo e Impar");
					else
						System.out.println("Cero y Par");
		
	}
	
	
}
