package Class;

import java.util.ArrayList;

public class Empleado extends Documento{
	private String cargo;
	private int id;
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Empleado(int numero, String nombre, String apellido, String sexo , int fechaNacimiento, String nacionalidad,  String cargo, int id) {
		super(numero, nombre, apellido, sexo, fechaNacimiento, nacionalidad);
		this.cargo = cargo;
		this.id = id;
	}
	
	public void Saludar() {
		System.out.println("Hola mi nombre es " + getNombre());
	}
	
	public void abrirSucursal(Sucursal sucursal, Empleado empleado) {
		sucursal.cambiarEstado(empleado, true);
	}
	
	public void entrarSucursal(Sucursal sucursal, Empleado empleado) {
		if(sucursal.isOpen()) {
			sucursal.setEmpleado(empleado);
			System.out.println("Entraste a la sucursal de " + sucursal.getDireccion());
		} else {
			System.out.println("Esta cerrado");
		}
	}
	
	public void searchProductoInEstante(Estante estante, String nombreProducto) {
		if(estante.findingProducto(nombreProducto)) {
			productos.add(estante.getProducto());
			System.out.println("Se añadio el producto " + nombreProducto + " en tu inventario");
		}else {
			System.out.println("No se encontro el producto " + nombreProducto);
		}
	}

	public void savingProductoInEstante(Estante estante, String nombre) {
		for(int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				estante.setProducto(productos.get(i));
				productos.remove(i);
				System.out.println("Se guardo el producto " + nombre + " en el estante");
			}else {
				System.out.println("No tienes el producto " + nombre);
			}
		}
	
	}
	public void getNombreOfProductos() {
		if(productos.size() == 0) {
			System.out.println("No tienes productos en tu inventario");
		}else {
			productos.stream().forEach((producto) -> {
				System.out.println(producto.getNombre());	
		
			});
		}
	}
	
	public String getCargo() {
		return cargo;
	}
}
