package Class;

import java.util.ArrayList;

public class Piso {
	private int numero;
	private ArrayList<Sector> sectores = new ArrayList<Sector>();
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public Piso(int numero) {
		this.numero = numero;
	}
	
	public void setSector(Sector sector) {
		sectores.add(sector);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void getSector() {
		sectores.stream().forEach((sector) -> {
			System.out.println(sector.getCodigo());
		});
	}
}
