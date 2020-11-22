package Class;

import java.util.ArrayList;

public class Libreria {
	private String nombre;
	
	private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
	
	public Libreria(String nombre, Sucursal sucursal) {
		this.nombre = nombre;
		añadirSucursal(sucursal);
	}
	
	public void añadirSucursal (Sucursal sucursal) {
		sucursales.add(sucursal);
	}
	
	public Sucursal getSucursal(String Direccion) {
		for (Sucursal sc: sucursales) {
			if(sc.getDireccion().equalsIgnoreCase(Direccion)) {
				return sc;
			}
		}
		return null;
	}
	
	public String getSucursales() {
		String listaSucursales = "";
		for (Sucursal sc : sucursales) {
			listaSucursales = listaSucursales.concat("* " + sc.getDireccion() + " ");
		}
		
		return listaSucursales;
		
	}
	
}
