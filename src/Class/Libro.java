package Class;

public class Libro extends Producto{
	private String edicionFisica;
	private String tipoCubierta;
	//private boolean saga;
	
	public Libro(String nombre, String editorial, String formato, String genero, String autor, String idioma, int edicion, int cantidadPaginas, double precio) {
		super(nombre, editorial, formato, genero, autor, idioma, edicion, cantidadPaginas, precio);
	}
}
