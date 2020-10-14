package Class;

import java.util.ArrayList;

public class Piso {
	private int numero;
	private ArrayList<Sector> sectores = new ArrayList<Sector>();
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public Piso(int numero) {
		this.numero = numero;
	}
	
	public void setSector(Sector sector) {
		sectores.add(sector);
	}
	
	public void setPersona(Persona persona) {
		personas.add(persona);
	}
	
	public void removePersona(Persona persona) {
		for(int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getNombre().equals(persona.getNombre())) {
				personas.remove(i);	
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
	
	public void getPersona() {
		personas.stream().forEach((persona) -> {
			System.out.println(persona.getNombre());
		});
	}
	
}
