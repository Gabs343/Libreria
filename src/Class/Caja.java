package Class;


public class Caja {
	
	private double saldo = 0;
	private boolean abierto;
	
	public void changeEstado(boolean abierto) {
		this.abierto = abierto;
	}

	
	public void ingresar(double precio) {
		saldo += precio;
	}
	
	
	
	public void calcular() {
		
	}
	

	
}
