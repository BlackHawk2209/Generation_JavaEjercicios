
public class Principal {
	public static void main(String[] args) {
		Animal animal = new perro();
		System.out.println(animal.comer());	
		
		perro canelo =new perro();
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
	}
}
