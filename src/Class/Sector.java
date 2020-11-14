package Class;

import java.util.ArrayList;

import dvlib.Dialogo;

public class Sector {
	private String nombre;
	
	private ArrayList<Estante> estantes = new ArrayList<Estante>();
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public Sector(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPersona(Persona persona) {
		personas.add(persona);
		Dialogo.mostrar(persona.getNombre() + " entro al sector: " + nombre);
	}
	
	public void removePersona(Persona persona) {
		personas.removeIf((p) -> p.getNombre() == nombre);
		Dialogo.mostrar(persona.getNombre() + " salio del sector: " + nombre);
	}
	
	public void añadirEstante(Estante estante) {
		estantes.add(estante);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Estante getEstante(int numero) {
		return estantes.get(numero - 1);
	}
}
