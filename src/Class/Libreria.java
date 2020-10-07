package Class;

import java.util.ArrayList;

public class Libreria {
	private String nombre;
	
	private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
	
	public Libreria(String nombre, Sucursal sucursal) {
		this.nombre = nombre;
		A�adirSucursal(sucursal);
	}
	
	public void A�adirSucursal (Sucursal sucursal) {
		sucursales.add(sucursal);
	}
	
	public void getSucursales() {
		sucursales.stream().forEach((sucursal) -> {
			System.out.println("Localidad: " + sucursal.getLocalidad());
			System.out.println("Direcci�n: " + sucursal.getDireccion() + " " + sucursal.getNumeroDireccion());
			System.out.println("Codigo Postal: " + sucursal.getCodigoPostal());
			System.out.println("Mail: " + sucursal.getMail());
			System.out.println("Telefono: " + sucursal.getTelefono() +"\n");
		});
		
	}
	
	
}
