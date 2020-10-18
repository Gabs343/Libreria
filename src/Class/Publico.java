package Class;

import java.util.List;
import java.util.ArrayList;

public class Publico implements Persona{
	private String nombre;
	private String apellido;
	private String gusto;
	private int indexOfItem;
	private Tarjeta tarjeta;
	private double saldo;
	
	private List <Producto> inventario = new ArrayList<Producto>();
	private List <Comprobante> comprobantes = new ArrayList<Comprobante>();
	
	public Publico(String nombre, String apellido, String gusto, double saldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.gusto = gusto;
		this.saldo = saldo;
	}
	
	public void setProducto(Producto producto) {
		inventario.add(producto);
	}
	
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta; 
	}
	
	public void setComprobante(Comprobante comprobante) {
		comprobantes.add(comprobante);
	}
	
	public void entrarSucursal(Sucursal sucursal, Persona persona) {
		if(sucursal.isOpen()) {
			sucursal.setPersona(persona);
			System.out.println(nombre + " entro a la sucursal de " + sucursal.getDireccion());
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
			sucursal.salirPersona(persona);
			System.out.println(nombre + " salio de la sucursal " + sucursal.getDireccion());
		}else {
			System.out.println(nombre + " tiene productos sin comprar");
		}
		
	}
	
	public void changeToPiso(Sucursal sucursal, Persona persona, int piso) {
		sucursal.moverPersonaInPiso(persona);
		sucursal.setPersonaInPiso(persona, piso);
		System.out.println(nombre + " ingreso al piso " + piso);
	}
	
	public void searchProductoInEstante(Estante estante, String nombreProducto) {
		if(estante.searchingProducto(nombreProducto)) {
			setProducto(estante.getProducto());
			System.out.println(nombre + " añadio el producto " + nombreProducto + " en su inventario");
		}else {
			System.out.println(nombre +" no encontro el producto " + nombreProducto + "en el estante");
		}
	}
	
	public void savingProductoInEstante(Estante estante, String nombreProducto) {
		for(int i = 0; i < inventario.size(); i++) {
			if(inventario.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
				estante.setProducto(inventario.get(i));
				inventario.remove(i);
				System.out.println(nombre + " guardo el producto " + nombreProducto + " en el estante");
			}else {
				System.out.println(nombre + " no tiene el producto " + nombreProducto);
			}
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
	
	public void getNombreOfProductos() {
		if(inventario.size() == 0) {
			System.out.println(nombre + " no tiene productos en su inventario");
		}else {
			inventario.stream().forEach((producto) -> {
			System.out.println(producto.getNombre());	
		
			});
		}
	}
	
	public void descontarSaldo(double precio) {
		saldo -= precio;
	}
	
	public void consultarCuentaTarjeta() {
		System.out.println(nombre + " tiene un saldo de " + tarjeta.getSaldo() + " en la tarjeta");
	}
	
	public void botarComprobante(int index) {
		comprobantes.remove(index);
		System.out.println(nombre + " elimino el comprobante");
	}
	
	public Producto getProducto() {
		Producto productoEnviado = inventario.get(indexOfItem);
		inventario.remove(indexOfItem);
		return productoEnviado;
	}
	
	public List<Producto> getInventario(){
		return this.inventario;
	}
	
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
}
