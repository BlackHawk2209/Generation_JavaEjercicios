
public class Cuadrado extends FiguraGeometrica{
	 protected float lado;
	
	 public Cuadrado(float lado) {
		 this.lado=lado;
	 }
	 
	 
	public void calcularArea() {
		area=lado*lado;
		System.out.println("El area del cuadrado es: " + area);
	}	
}
