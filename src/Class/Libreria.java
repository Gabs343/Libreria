package Class;

import java.util.ArrayList;

public class Libreria {
	private String nombre;
	
	private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
	
	public Libreria(String nombre, Sucursal sucursal) {
		this.nombre = nombre;
		AñadirSucursal(sucursal);
	}
	
	public void AñadirSucursal (Sucursal sucursal) {
		sucursales.add(sucursal);
	}
	
	public void getSucursales() {
		sucursales.stream().forEach((sucursal) -> {
			System.out.println("Localidad: " + sucursal.getLocalidad());
			System.out.println("Dirección: " + sucursal.getDireccion() + " " + sucursal.getNumeroDireccion());
			System.out.println("Codigo Postal: " + sucursal.getCodigoPostal());
			System.out.println("Mail: " + sucursal.getMail());
			System.out.println("Telefono: " + sucursal.getTelefono() +"\n");
		});
		
	}
	
	
}
