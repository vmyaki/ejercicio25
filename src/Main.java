import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1;
		int num2;
		int cont=1;
		int intentos=1;

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce numerador: ");
		num1=teclado.nextInt();
		
		System.out.println("Introduce denominador: ");
		num2=teclado.nextInt();
		
		if (num2==0) {
			
			while (cont<5)
			{
				System.out.println("Porfavor introduce un denominador valido: ");
				num2=teclado.nextInt();
				if (num2==0) {
					cont++;
					intentos++;
				}
				else {
					
					cont=5;
				}
			
			}
		
			
		}
		
		if(intentos==5) {
			
			System.out.println("Te has pasado");
		}
		else {
			
			double calculo=num1/num2;
			System.out.println("Resultado de la división: "+calculo);
			
		}
		
		
		

	}

}
