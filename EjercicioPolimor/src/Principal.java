
public class Principal {
	public static void main(String[] args) {
		
		FiguraGeometrica cuadro = new Cuadrado(5);
		cuadro.calcularArea();
		
		FiguraGeometrica triangulo= new Triangulo(5,2);
		triangulo.calcularArea();
		
		FiguraGeometrica circulo = new Circulo(5);
		circulo.calcularArea();
		
	}
}
