import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		float arreglo[];
		arreglo = new float[3];
		float aux;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.printf("Introduzca el numero %d: ", i+1);
			arreglo[i]=entrada.nextFloat();
		}
			
		
			for(int k=0; k<arreglo.length-1; k++) 
			{
				for(int j=0; j<arreglo.length-1; j++) 
				{				
					if(arreglo[j]>arreglo[j+1]) 
					{
						aux= arreglo[j];
						arreglo[j]= arreglo[j+1];
						arreglo[j+1]=aux;
					}
				}
			}
				
	System.out.println("Los numeros ordenados de menor a mayor son:");
				for(int z=0; z<arreglo.length; z++) {
					System.out.println(arreglo[z]);
				}
				
				
	System.out.println("Los numeros ordenados de mayor a menor son: ");
				for(int x=arreglo.length-1; x>=0; x--) {
					System.out.println(arreglo[x]);
				}
	
	System.out.println("El numero mayor es: " + arreglo[2]);
							
	}
	
}
