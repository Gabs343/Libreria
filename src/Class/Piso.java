package Class;

import java.util.ArrayList;

public class Piso {
	private int numero;
	private ArrayList<Sector> sectores = new ArrayList<Sector>();
	
	public Piso(int numero) {
		this.numero = numero;
	}
	
	public void añadirSector(Sector sector) {
		sectores.add(sector);
	}
	
	public int getNumero() {
		return numero;
	}
}
