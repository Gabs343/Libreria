package Class;

import java.util.ArrayList;

public class Estante extends Articulo{
	private int separaciones;
	private int indexOfProducto;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Estante(String material, String color, String forma, double profundidad, double ancho, double altura, int separaciones) {
		super(material, color, forma, profundidad, ancho, altura);
		this.separaciones = separaciones;
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
	
	public Producto getProducto() {
		Producto productoCopy = productos.get(indexOfProducto);
		productos.remove(indexOfProducto);
		return productoCopy;
	}
	
}
