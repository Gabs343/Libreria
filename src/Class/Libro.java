package Class;

public class Libro implements Producto{
	private String genero;
	private String autor;
	private String nombre;
	private double precio;
	private boolean comprado;
	
	public Libro(String genero, String autor, String nombre, double precio) {
		this.genero = genero;
		this.autor = autor;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void setPurchase() {
		comprado = true;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	public boolean isBought() {
		return comprado;
	}
}
