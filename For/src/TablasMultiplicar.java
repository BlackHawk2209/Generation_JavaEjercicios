import java.util.Scanner;

public class TablasMultiplicar {
	
	public static void main(String[] args ) {
		int mul;
		
		Scanner x = new Scanner(System.in);
		System.out.println("Ingresa el numero de tu tabla");	
		mul= x.nextInt();
		tabla(mul);
		}
	
	
	
	public static void tabla(int mul) {
		int res;
		for(int i=1; i<=10; i++) {			
			res = i*mul;
			System.out.println(i + " X " + mul + " = " + res);
	}}
}

