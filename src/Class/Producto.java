package Class;

public abstract class Producto {
	private String formato;
	private String editorial;
	private String genero;
	private String autor;
	private String idioma;
	private String nombre;
	private int edicion;
	private double precio;
	private boolean comprado;
	
	public Producto(String nombre, String formato, String editorial, String genero, String autor, String idioma, int edicion, double precio) {
		this.nombre = nombre;
		this.formato = formato;
		this.editorial = editorial;
		this.genero = genero;
		this.autor = autor;
		this.idioma = idioma;
		this.edicion = edicion;
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
