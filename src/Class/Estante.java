package Class;

import java.util.ArrayList;

public class Estante extends Articulo{
	private int separaciones;
	//private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Estante(String material, String color, String forma, double largo, double ancho, double altura, int separaciones) {
		super(material, color, forma, largo, ancho, altura);
		this.separaciones = separaciones;
	}
	
	public void Agregar(/*Producto producto*/) {
		
	}
	
	public void Sacar(/*Producto producto*/) {
		
	}
}
