package Class;

import java.util.Random;

public class Empleado implements Persona{
	private String nombre;
	private String apellido;
	private String cargo;
	private int id;
	
	public Empleado(String nombre, String apellido,  String cargo, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.id = id;
	}
	
	public void saludar() {
		System.out.println("Hola mi nombre es " + nombre);
	}
	
	public void abrirSucursal(Sucursal sucursal, Empleado empleado) {
		sucursal.cambiarEstado(empleado, true);
	}
	
	public void cerrarSucursal(Sucursal sucursal, Empleado empleado) {
		sucursal.cambiarEstado(empleado, false);
	}
	
	public void entrarSucursal(Sucursal sucursal, Persona persona) {
		if(sucursal.isOpen()) {
			sucursal.setPersona(persona);
			System.out.println(nombre + " entro a la sucursal de " + sucursal.getDireccion());
		} else {
			System.out.println("Esta cerrado");
		}
	}
	
	public void salirSucursal(Sucursal sucursal, Persona persona) {
		sucursal.removePersona(persona);
		System.out.println(nombre + " Salio de la sucursal " + sucursal.getDireccion());	
	}
	
	public void changeToPiso(Sucursal sucursal, Persona persona, int piso) {
		sucursal.removePersonaInPiso(persona);
		sucursal.setPersonaInPiso(persona, piso);
		System.out.println(nombre + " ingreso al piso " + piso);
	}
	
	
	public void cobrar(Publico publico) {
		double precioTotal = 0;
		for(int i = 0; i < publico.getInventario().size(); i++) {
			precioTotal += publico.getInventario().get(i).getPrecio();
		}
		
		Tarjeta tarjeta = publico.getTarjeta();
		
		if(tarjeta.pasarTarjeta(precioTotal)) {
			System.out.println(nombre + " le cobro a " + publico.getNombre() + " con exito");
			for(int i = 0; i < publico.getInventario().size(); i++) {
				publico.getInventario().get(i).setPurchase();
			}
			
			Random rnd = new Random();
			int serial = rnd.nextInt(9000);
			
			String nombreCompleto = publico.getApellido() + " " + publico.getNombre();
			
			publico.setComprobante(new Comprobante(serial, nombreCompleto, 1, tarjeta.getTipo(), precioTotal));
			
		}else {
			System.out.println("La tarjeta no paso");
		}
	
		
		
	}
	
	public String getCargo() {
		return cargo;
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
}
