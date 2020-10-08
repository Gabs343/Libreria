package Class;

import java.util.ArrayList;

public class Sector {
	private String nombre;
	private String codigo;
	
	private ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	
	public Sector(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public void Limpiar() {}
	
	public void aņadirArticulo(Articulo articulo) {
		articulos.add(articulo);
	}
}
