package Class;

import java.util.ArrayList;

public class Sucursal {
	private String localidad;
	private String direccion;
	private String mail;
	
	private int numeroDireccion;
	private int codPostal;
	private int cantPisos;
	private int telefono;
	
	private boolean abierto = false;
	
	//private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	//private ArrayList<Inventario> inventarios = new ArrayList<Inventario>();
	private ArrayList<Sector> sectores = new ArrayList<Sector>();
	
	public Sucursal(String localidad, String direccion, int numeroDireccion, int codPostal, int cantPisos, int telefono, String mail) {
		this.localidad = localidad;
		this.direccion = direccion;
		this.numeroDireccion = numeroDireccion;
		this.codPostal = codPostal;
		this.cantPisos = cantPisos;
		this.telefono = telefono;
		this.mail = mail;	
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
}	
