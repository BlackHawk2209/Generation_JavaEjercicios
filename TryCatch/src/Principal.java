
public class Principal {
	static int numerador=10;
	static Integer denominador=0;  //Null o 0 y entrara al catch diferente
	static float division;
	
	public static void main(String[] args) {
		System.out.println("Antes de la division");
		
		//Posibilidad de que haya errores
		try {           
			division= numerador/denominador;
		}catch(ArithmeticException ex) {   //Si esto falla entramos al catch si no falla nope
			division = 0;					// Aritmetic hereda se puede usar exception para abarcar toda la jerarquia 
			System.out.println("Error: " + ex.getMessage());
			System.out.println("Estamos en el primer catch");
			
		}catch(NullPointerException ex) {
			division = 0;
			System.out.println("Error: " + ex.getMessage());
			System.out.println("Estamos en el segundo catch");
		} finally{ //SI o SI se va a ejecutar entre al try o al catch
			System.out.println("Despues de la division");
		}
		
		
		
	}
	
	
}
