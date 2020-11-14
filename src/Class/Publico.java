package Class;

import dvlib.Dialogo;
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
	
	public void entrarSucursal(Sucursal sucursal) {
		if(sucursal.isOpen()) {
			sucursal.setPersonaInPiso(this, 0);
			Dialogo.mostrar(nombre + " entro a la sucursal de " + sucursal.getDireccion());
		} else {
			Dialogo.mostrar("Esta cerrado");

		}
	}
	
	public void salirSucursal(Sucursal sucursal) {
		int productosComprados = 0;
		for(int i = 0; i < inventario.size(); i++) {
			if(inventario.get(i).isBought()) {
				productosComprados++;
			}
		}
		
		if(productosComprados == inventario.size()) {
			sucursal.removerPersonaInPiso(this);
			Dialogo.mostrar(nombre + " salio de la sucursal " + sucursal.getDireccion());
		}else {
			Dialogo.mostrar(nombre + " tiene productos sin comprar");
		}
		
	}
	
	public void changeToPiso(Sucursal sucursal, int piso) {
		sucursal.removerPersonaInPiso(this);
		sucursal.setPersonaInPiso(this, piso);
		Dialogo.mostrar(nombre + " ingreso al piso " + piso);
	}
	
	public void enterSector(Sector sector) {
		sector.setPersona(this);
	}
	
	public void exitSector(Sector sector) {
		sector.removePersona(this);
	}
	
	public void searchProductoInEstante(Estante estante, String nombreProducto) {
		if(estante.searchingProducto(nombreProducto)) {
			setProducto(estante.getProducto());
			Dialogo.mostrar(nombre + " añadio el producto " + nombreProducto + " en su inventario");
		}else {
			Dialogo.mostrar(nombre +" no encontro el producto " + nombreProducto + " en el estante");
		}
	}
	
	public void savingProductoInEstante(Estante estante, String nombreProducto) {
		for(int i = 0; i < inventario.size(); i++) {
			if(inventario.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
				estante.setProducto(inventario.get(i));
				inventario.remove(i);
				Dialogo.mostrar(nombre + " guardo el producto " + nombreProducto + " en el estante");
			}else {
				Dialogo.mostrar(nombre + " no tiene el producto " + nombreProducto);
			
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
			Dialogo.mostrar(nombre + " no tiene productos en su inventario");
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
		Dialogo.mostrar(nombre + " tiene un saldo de " + tarjeta.getSaldo() + " en la tarjeta");
	}
	
	public void botarComprobante(int index) {
		comprobantes.remove(index);
		Dialogo.mostrar(nombre + " elimino el comprobante");
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
