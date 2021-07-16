
public class Triangulo extends FiguraGeometrica{
	protected float base,altura;
	
public Triangulo(float base, float altura) {		
		this.altura=altura;
		this.base=base;		
}
	
	public void calcularArea() {
		area=(base*altura)/2;
		System.out.println("El area del triangulo es: " + area);
	}
}
