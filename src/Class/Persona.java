package Class;

import java.util.ArrayList;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int fechaNacimiento;
	private String nacionalidad;
	private String sexo;
	private int numero;
	private int indexOfItem;
	
	protected ArrayList<Producto> inventario = new ArrayList<Producto>();
	private ArrayList <Billete> billetera = new ArrayList <Billete>();
	private ArrayList <Tarjeta> tarjetas = new ArrayList <Tarjeta>();
	private ArrayList <Comprobante> comprobantes = new ArrayList<Comprobante>();
	
	public Persona(int numero, String nombre, String apellido, String sexo, int fechaNacimiento, String nacionalidad) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
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
	
	public void searchProductoInEstante(Estante estante, String nombreProducto) {
		if(estante.searchingProducto(nombreProducto)) {
			setProducto(estante.getProducto());
			System.out.println("Se a�adio el producto " + nombreProducto + " en tu inventario");
		}else {
			System.out.println("No se encontro el producto " + nombreProducto);
		}
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
	
	public void changeToPiso(Sucursal sucursal, Persona persona, int piso) {
		sucursal.removePersonaInPiso(persona);
		sucursal.setPersonaInPiso(persona, piso);
		System.out.println("Ingresaste al piso " + piso);
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
	
	public Producto getProducto() {
		Producto productoCopy = inventario.get(indexOfItem);
		inventario.remove(indexOfItem);
		return productoCopy;
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
	
	public String getNombre() {
		return nombre;
	}
}
