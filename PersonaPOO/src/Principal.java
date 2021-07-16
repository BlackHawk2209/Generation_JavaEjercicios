
public class Principal {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Persona carlos=new Persona();
		carlos.name="Carlos Educardo";
		carlos.age=30;
		
		System.out.println(carlos.saludar());
		System.out.println(carlos.miEdad());
	}
}
