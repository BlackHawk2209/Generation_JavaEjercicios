import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		int num;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Ingresa el numero que quieras calcular: ");
		num=x.nextInt();
		
		suma(num);			
	}
	
	public static void suma(int num) {
		int par=0;
		int impar=0;
		
		
		for(int i=0; i<=num; i++) {
			//par
			if(i%2==0) {
				par+=i;
			}else {
			
				impar+= i;
			}
			
		}
		System.out.println("La suma de todos los numero pares es: " + par);
		System.out.println("La suma de todos los numeros impares es: " + impar);
	}
	
}
