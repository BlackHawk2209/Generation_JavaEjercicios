import java.util.Scanner;

public class FlujoSwitch {
	public static void main(String[] args) {
		
		Scanner x= new Scanner(System.in);
		int numero1, numero2, opc, resp;
		
		System.out.println("Ingresa el primer numero");
		numero1=x.nextInt();
		System.out.println("Ingresa el segundo numero");
		numero2= x.nextInt();
		System.out.println("Elige la opcion que deseas \n 1) Suman\n2)Resta \n 3)Multiplicacion \n 4)Division");
		opc=x.nextInt();
		int c=0;
		
	while(c==0) {
		switch(opc) {
		case 1: resp= numero1+numero2;
				System.out.print("El resultado de la suma es= " + resp);
			break;
			
		case 2: resp= numero1-numero2;
		System.out.println("El resultado de la resta es= " + resp);
			break;
			
		case 3: resp= numero1*numero2;
		System.out.println("El resultado de la multiplicacion es= " + resp);
			break;
			
		case 4: resp= numero1/numero2;
		System.out.println("El resultado de la divison es= " + resp);
			c=1;
			break;
			
		default: System.out.println("La opcion elegida es incorrecta");	
						
			}}
		
		/*int ang1, ang2, ang3;
		System.out.println("Introduce el angulo 1");
		ang1= x.nextInt();
		System.out.println("Introduce el anglo 2");
		ang2= x.nextInt();
		System.out.println("Introduce el angulo 3");
		ang3= x.nextInt();
		
		if(ang1+ang2+ang3==180) {
			System.out.println("Es un triangulo valido");
		}
		else {
			System.out.println("No es un triangulo valido");
		}
		*/
		
	}
}
