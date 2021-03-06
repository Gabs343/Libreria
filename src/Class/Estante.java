package Class;

import java.util.ArrayList;

public class Estante {
	private String material;
	private String color;
	private String forma;
	private double ancho;
	private double largo;
	private double profundidad;
	private int indexOfProducto;
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Estante(String material, String color, String forma, double ancho, double largo, double profundidad) {
		this.material = material;
		this.color = color; 
		this.forma = forma;
		this.ancho = ancho;
		this.largo = largo;
		this.profundidad = profundidad;
	}
	
	public void setProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	public boolean searchingProducto(String nombre) {
		boolean condicion = false;
		for(int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				indexOfProducto = i;
				condicion = true;
			}
		}
		return condicion;
	}
	
	public String getProductos() {
		String listaProductos = "";
		for (Producto pt : productos) {
			listaProductos = listaProductos.concat("\n* " + pt.getNombre() + " - " + pt.getAutor() +" - $" + pt.getPrecio());
		}
		
		return listaProductos;
		
	}	
	public Producto getProducto() {
		Producto productoEnviado = productos.get(indexOfProducto);
		productos.remove(indexOfProducto);
		return productoEnviado;
	}

}
