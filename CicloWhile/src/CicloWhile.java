import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		int c=0;
		int num1, num2;
		
		Scanner x= new Scanner(System.in);
		
		
		while(c==0) {
			System.out.println("Ingresa el un numero: ");
			num1= x.nextInt();
			
			System.out.println("Ingresa otro numero: ");
			num2=x.nextInt();
			
			if(num1==num2) {
				System.out.println("Los numeros son iguales \n Fin del programa");
				c=1;
			}else {
				System.out.println("Los numero son diferentes sigue en ejecucion");
			}			
		}	
	}
}
