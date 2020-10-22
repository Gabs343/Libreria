package Class;

import java.util.ArrayList;

public class Sector {
	private String nombre;
	
	private ArrayList<Estante> estantes = new ArrayList<Estante>();
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public Sector(String nombre) {
		this.nombre = nombre;
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
	
	public void añadirEstante(Estante estante) {
		estantes.add(estante);
	}
	
	public String getNombre() {
		return nombre;
	}
}
