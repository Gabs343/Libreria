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
	
	private Piso[] pisos; 
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	//private ArrayList<Inventario> inventarios = new ArrayList<Inventario>();
	
	
	public Sucursal(String localidad, String direccion, int numeroDireccion, int codigoPostal, int cantidadPisos, int telefono, String mail) {
		this.localidad = localidad;
		this.direccion = direccion;
		this.numeroDireccion = numeroDireccion;
		this.codigoPostal = codigoPostal;
		this.cantidadPisos = cantidadPisos;
		this.telefono = telefono;
		this.mail = mail;
		
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

	public void setEmpleado(Empleado empleado) {
		empleados.add(empleado);
		pisos[0].setEmpleado(empleado);
	}

	public void removeEmpleado(Empleado empleado) {
		for(int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i).getNombre().equals(empleado.getNombre())) {
				empleados.remove(i);
				
			}
		}
	}
	
	public void setEmpleadoInPiso(Empleado empleado, int numeroPiso) {
		pisos[numeroPiso].setEmpleado(empleado);
	}
	
	public void removeEmpleadoInPiso(Empleado empleado) {
		for(int i = 0; i < pisos.length; i++) {
			pisos[i].removeEmpleado(empleado);
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
	
	public void getSectoresInPiso(int numeroPiso) {
		System.out.println("Piso: " + pisos[numeroPiso].getNumero());
		pisos[numeroPiso].getSector();	
	}
	
	public void getEmpleadosInPiso(int numeroPiso) {
		System.out.println("Piso: " + pisos[numeroPiso].getNumero());
		pisos[numeroPiso].getEmpleado();
	}
}	
