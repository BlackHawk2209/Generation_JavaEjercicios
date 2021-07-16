
public class Circulo extends FiguraGeometrica {
	protected float radio;
	
	public Circulo(float radio) {
	this.radio=radio;
	}
	
	public void calcularArea() {
		area = Math.PI*(radio*radio);
		System.out.println("El area del circulo es: " + area);
	}
}
