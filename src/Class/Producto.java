package Class;

public abstract class Producto {
	private String formato;
	private String editorial;
	private String genero;
	private String autor;
	private String idioma;
	private String nombre;
	private int edicion;
	private int cantidadPaginas;
	private double precio;
	private boolean comprado = false;
	
	public Producto(String nombre, String formato, String editorial, String genero, String autor, String idioma, int edicion, int cantidadPaginas, double precio) {
		this.nombre = nombre;
		this.formato = formato;
		this.editorial = editorial;
		this.genero = genero;
		this.autor = autor;
		this.idioma = idioma;
		this.edicion = edicion;
		this.cantidadPaginas = cantidadPaginas;
		this.precio = precio;
	}
	
	public void pasarPagina(int numeroDePagina) {
		if(numeroDePagina > cantidadPaginas) {
			System.out.println("No hay página " + numeroDePagina);
		}else {
			System.out.println("Página " + numeroDePagina);
		}
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setPurchase() {
		comprado = true;
	}
	
	public boolean isBought() {
		return comprado;
	}

}
