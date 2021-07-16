import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		String nombre, apellido;
		Scanner x= new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		nombre = x.nextLine();
		System.out.println("Escribe tu apellido: ");
		apellido = x.nextLine();
		
		System.out.println(saludo(nombre, apellido));
		
		
		
	}
	
	public static String saludo(String nombre, String apellido) {
		return "Hola: " + nombre + "  " + apellido;
	}
}
	

