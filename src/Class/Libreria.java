package Class;

import java.util.ArrayList;

public class Libreria {
	private String nombre;
	
	private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
	
	public Libreria(String nombre) {
		this.nombre = nombre;
	}
	
	public void AņadirSucursal (Sucursal sucursal) {
		sucursales.add(sucursal);
	}
	
	
}
