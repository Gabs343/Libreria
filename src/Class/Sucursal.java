package Class;

import java.util.ArrayList;

public class Sucursal {
	private String localidad;
	private String direccion;
	private String mail;
	
	private int numeroDireccion;
	private int codigoPostal;
	private int cantidadPisos;
	private int telefono;
	
	private boolean abierto = false;
	
	private Caja caja;
	
	private Piso[] pisos; 
	
	public Sucursal(String localidad, String direccion, int numeroDireccion, int codigoPostal, int cantidadPisos, int telefono, String mail) {
		this.localidad = localidad;
		this.direccion = direccion;
		this.numeroDireccion = numeroDireccion;
		this.codigoPostal = codigoPostal;
		this.cantidadPisos = cantidadPisos;
		this.telefono = telefono;
		this.mail = mail;
		
		caja = new Caja();
		creandoPisos(cantidadPisos + 1);
	}
	
	private void creandoPisos(int numero) {
		pisos = new Piso[numero];
		for(int i = 0; i < pisos.length; i++) {
			pisos[i] = new Piso(i);
		}

	}
	
	public boolean isOpen() {
		return abierto;
	}
	
	public void cambiarEstado(String cargoEmpleado, boolean abierto) {
		if(cargoEmpleado.equalsIgnoreCase("Encargado")) {
			this.abierto = abierto;
		}else {
			System.out.println("No eres el encargado");
		}
	}
	
	public void setSectorInPiso(int numero, Sector sector) {
		pisos[numero].setSector(sector);
	}
	
	public void setPersonaInPiso(Persona persona, int numeroPiso) {
		pisos[numeroPiso].setPersona(persona);
	}
	
	public void removerPersonaInPiso(Persona persona) {
		for(int i = 0; i < pisos.length; i++) {
			pisos[i].removePersona(persona.getNombre());
		}
	}
	
	public void setEstanteInSector(int piso, String sector, Estante estante) {
		pisos[piso].getSector(sector).añadirEstante(estante);
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getMail() {
		return mail;
	}
	
	public int getNumeroDireccion() {
		return numeroDireccion;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public Caja getCaja() {
		return caja;
	}
	
	public Piso getPiso(int numero) {
		return pisos[numero];
	}
	
	public int getPisos() {
		return pisos.length - 1;
	}

	
}	
