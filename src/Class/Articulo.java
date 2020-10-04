package Class;

public abstract class Articulo {
	private String material;
	private String color;
	private String forma;
	private double profundidad;
	private double ancho;
	private double altura;

	public Articulo(String material, String color, String forma, double profundidad, double ancho, double altura) {
		this.material = material;
		this.color = color;
		this.forma = forma;
		this.profundidad = profundidad;
		this.ancho = ancho;
		this.altura = altura;
	} 	
}
