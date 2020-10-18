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
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	//private ArrayList<Inventario> inventarios = new ArrayList<Inventario>();
	
	
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
	
	public void cambiarEstado(Empleado empleado, boolean abierto) {
		if(empleado.getCargo().equalsIgnoreCase("Encargado")) {
			this.abierto = abierto;
		}else {
			System.out.println("No eres el encargado");
		}
	}
	
	public void setSectorInPiso(int numero, Sector sector) {
		pisos[numero].setSector(sector);
	}

	public void setPersona(Persona persona) {
		personas.add(persona);
		pisos[0].setPersona(persona);
	}

	public void salirPersona(Persona persona) {
		for(int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getNombre().equalsIgnoreCase(persona.getNombre())) {
				personas.remove(i);
				
			}
		}
	}
	
	public void setPersonaInPiso(Persona persona, int numeroPiso) {
		pisos[numeroPiso].setPersona(persona);
	}
	
	public void moverPersonaInPiso(Persona persona) {
		for(int i = 0; i < pisos.length; i++) {
			pisos[i].removePersona(persona);
		}
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
	
	public void getSectoresInPiso(int numeroPiso) {
		System.out.println("Piso: " + pisos[numeroPiso].getNumero());
		pisos[numeroPiso].getSector();	
	}
	
}	
