package Class;

import java.util.ArrayList;

public class Publico implements Persona{
	private String nombre;
	private String apellido;
	private String gusto;
	private int indexOfItem;
	
	private ArrayList <Producto> inventario = new ArrayList<Producto>();
	private ArrayList <Billete> billetera = new ArrayList<Billete>();
	private ArrayList <Tarjeta> tarjetas = new ArrayList<Tarjeta>();
	private ArrayList <Comprobante> comprobantes = new ArrayList<Comprobante>();
	
	public Publico(String nombre, String apellido, String gusto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.gusto = gusto;
	}
	
	public void entrarSucursal(Sucursal sucursal, Persona persona) {
		if(sucursal.isOpen()) {
			sucursal.setPersona(persona);
			System.out.println("Entraste a la sucursal de " + sucursal.getDireccion());
		} else {
			System.out.println("Esta cerrado");
		}
	}
	
	public void salirSucursal(Sucursal sucursal, Persona persona) {
		int productosComprados = 0;
		for(int i = 0; i < inventario.size(); i++) {
			if(inventario.get(i).isBought()) {
				productosComprados++;
			}
		}
		
		if(productosComprados == inventario.size()) {
			sucursal.removePersona(persona);
			System.out.println("Saliste de la sucursal " + sucursal.getDireccion());
		}else {
			System.out.println("Tienes productos sin comprar");
		}
		
	}
	
	public void changeToPiso(Sucursal sucursal, Persona persona, int piso) {
		sucursal.removePersonaInPiso(persona);
		sucursal.setPersonaInPiso(persona, piso);
		System.out.println("Ingresaste al piso " + piso);
	}
	
	
	public void setProducto(Producto producto) {
		inventario.add(producto);
	}
	
	public void setBillete(Billete billete) {
		billetera.add(billete);
	}
	
	public void setTarjeta(Tarjeta tarjeta) {
		tarjetas.add(tarjeta);
	}
	
	public void setComprobante(Comprobante comprobante) {
		comprobantes.add(comprobante);
	}
	
	public void searchProductoInEstante(Estante estante, String nombreProducto) {
		if(estante.searchingProducto(nombreProducto)) {
			setProducto(estante.getProducto());
			System.out.println("Se añadio el producto " + nombreProducto + " en tu inventario");
		}else {
			System.out.println("No se encontro el producto " + nombreProducto);
		}
	}
	
	public boolean searchingProducto(String nombre) {
		boolean condicion = false;
		for(int i = 0; i < inventario.size(); i++) {
			if(inventario.get(i).getNombre().equalsIgnoreCase(nombre)) {
				indexOfItem = i;
				condicion = true;
			}
		}
		return condicion;
	}
	
	public void savingProductoInEstante(Estante estante, String nombre) {
		for(int i = 0; i < inventario.size(); i++) {
			if(inventario.get(i).getNombre().equalsIgnoreCase(nombre)) {
				estante.setProducto(inventario.get(i));
				inventario.remove(i);
				System.out.println("Se guardo el producto " + nombre + " en el estante");
			}else {
				System.out.println("No tienes el producto " + nombre);
			}
		}
	
	}
	
	public void getNombreOfProductos() {
		if(inventario.size() == 0) {
			System.out.println("No tienes productos en tu inventario");
		}else {
			inventario.stream().forEach((producto) -> {
				System.out.println(producto.getNombre());	
		
			});
		}
	}
	
	public Producto getProducto() {
		Producto productoCopy = inventario.get(indexOfItem);
		inventario.remove(indexOfItem);
		return productoCopy;
	}
	

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	
}
