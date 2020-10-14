package Class;

import java.util.ArrayList;

public class Empleado extends Persona{
	private String cargo;
	private int id;
	
	public Empleado(int numero, String nombre, String apellido, String sexo , int fechaNacimiento, String nacionalidad,  String cargo, int id) {
		super(numero, nombre, apellido, sexo, fechaNacimiento, nacionalidad);
		this.cargo = cargo;
		this.id = id;
	}
	
	public void Saludar() {
		System.out.println("Hola mi nombre es " + getNombre());
	}
	
	public void abrirSucursal(Sucursal sucursal, Empleado empleado) {
		sucursal.cambiarEstado(empleado, true);
	}
	
	public void cerrarSucursal(Sucursal sucursal, Empleado empleado) {
		sucursal.cambiarEstado(empleado, false);
	}
	
	public String getCargo() {
		return cargo;
	}
}
