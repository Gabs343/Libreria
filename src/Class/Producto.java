package Class;

public abstract class Producto {
	private String formato;
	private String editorial;
	private String genero;
	private String autor;
	private String idioma;
	private int edicion;
	private int codigo;
	private int cantidadPaginas;
	private double precio;
	
	public Producto(String formato, String editorial, String genero, String autor, String idioma, int edicion, int codigo, int cantidadPaginas, double precio) {
		this.formato = formato;
		this.editorial = editorial;
		this.genero = genero;
		this.autor = autor;
		this.idioma = idioma;
		this.edicion = edicion;
		this.codigo = codigo;
		this.cantidadPaginas = cantidadPaginas;
		this.precio = precio;
	}

}
