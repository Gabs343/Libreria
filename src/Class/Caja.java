package Class;

import java.util.Random;

public class Caja {
	
	private double saldo = 0;
	private boolean abierto;
	
	public void crearComprobante(Publico publico, Tarjeta tarjeta, double precioTotal) {
		Random rnd = new Random();
		int serial = rnd.nextInt(9000);
		
		String nombreCompleto = publico.getApellido() + " " + publico.getNombre();
		
		publico.setComprobante(new Comprobante(serial, nombreCompleto, 1, tarjeta.getTipo(), precioTotal));
	}
	
	public void changeEstado(boolean abierto) {
		this.abierto = abierto;
	}

	
	public void ingresar(double precio) {
		saldo += precio;
	}
	
	
	
	public void calcular() {
		
	}
	

	
}
