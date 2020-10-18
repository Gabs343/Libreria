package Class;

import java.util.ArrayList;

public class Sector {
	private String nombre;
	private String codigo;
	
	private ArrayList<Estante> estantes = new ArrayList<Estante>();
	
	public Sector(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public void añadirEstante(Estante estante) {
		estantes.add(estante);
	}
	
	public String getCodigo() {
		return codigo;
	}
}
