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
	
	private Piso[] pisos = new Piso[cantidadPisos]; 
	//private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	//private ArrayList<Inventario> inventarios = new ArrayList<Inventario>();
	private ArrayList<Sector> sectores = new ArrayList<Sector>();
	
	public Sucursal(String localidad, String direccion, int numeroDireccion, int codigoPostal, int cantidadPisos, int telefono, String mail) {
		this.localidad = localidad;
		this.direccion = direccion;
		this.numeroDireccion = numeroDireccion;
		this.codigoPostal = codigoPostal;
		this.cantidadPisos = cantidadPisos;
		this.telefono = telefono;
		this.mail = mail;
		
		creandoPisos();
	}
	
	private void creandoPisos() {
		for(int i = 0; i < pisos.length; i++) {
			pisos[i] = new Piso(i);
		}
	}
	
	public void Abrir() {
		abierto = true;
	}
	
	public void Limpiar() {
		
	}
	
	public void Cerrar() {
		abierto = false;
	}
	
	public void AñadirSector(Sector sector) {
		sectores.add(sector);
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
	
	public void setSectorInPiso(int piso, Sector sector) {
		pisos[piso].añadirSector(sector);
	}

}	
