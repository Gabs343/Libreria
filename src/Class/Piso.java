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
	
	public void setEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void removeEmpleado(Empleado empleado) {
		for(int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i).getNombre().equals(empleado.getNombre())) {
				empleados.remove(i);	
			}
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void getSector() {
		sectores.stream().forEach((sector) -> {
			System.out.println(sector.getCodigo());
		});
	}
	
	public void getEmpleado() {
		empleados.stream().forEach((empleado) -> {
			System.out.println(empleado.getNombre());
		});
	}
	
}
