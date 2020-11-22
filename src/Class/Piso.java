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
	
	public void removePersona(String nombre) {
		personas.removeIf((p) -> p.getNombre() == nombre);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Sector getSector(String nombreSector) {
		for (Sector sector: sectores) {
			if(sector.getNombre().equalsIgnoreCase(nombreSector)) {
				return sector;
			}
		}
		return null;
	}
	public String getSectores() {
		String listaSectores = "";
		for (Sector sct : sectores) {
			listaSectores = listaSectores.concat("\n* " + sct.getNombre() + " ");
		}
		
		return listaSectores;
	}
	
}
