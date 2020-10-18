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
		sucursal.salirPersona(persona);
		System.out.println(nombre + " salio de la sucursal " + sucursal.getDireccion());	
	}
	
	public void changeToPiso(Sucursal sucursal, Persona persona, int piso) {
		sucursal.moverPersonaInPiso(persona);
		sucursal.setPersonaInPiso(persona, piso);
		System.out.println(nombre + " ingreso al piso " + piso);
	}
	
	
	public void cobrar(Sucursal sucursal, Publico publico, Caja caja) {
		System.out.println("1. Efectivo, 2. Tarjeta");
		int ans = 2;
		switch(ans) {
		case 1:
			metodoPagoEfectivo(publico);
			sucursal.getCaja().changeEstado(true);
			sucursal.getCaja().ingresar(getPrecioTotal(publico));
			sucursal.getCaja().changeEstado(false);
			break;
		case 2:
			metodoPagoTarjeta(publico, publico.getTarjeta());
			caja.crearComprobante(publico, publico.getTarjeta(), getPrecioTotal(publico));
			break;
		default:
			System.out.println("Debes elegir el método de pago");
			break;	
		}
		
	}
	
	private void metodoPagoEfectivo(Publico publico) {
		if(publico.getSaldo() >= getPrecioTotal(publico)) {
			publico.descontarSaldo(getPrecioTotal(publico));
			escanearProductos(publico);
		}else {
			System.out.println(publico.getNombre() + " no tiene suficiente saldo");
		}
	}
	
	private void metodoPagoTarjeta(Publico publico, Tarjeta tarjeta) {
		if(tarjeta.pasarTarjeta(getPrecioTotal(publico))) {
			System.out.println(nombre + " le cobro a " + publico.getNombre() + " con exito");
			
			escanearProductos(publico);
			
		}else {
			System.out.println("La tarjeta no paso");
		}	
	}
	
	private double getPrecioTotal(Publico publico) {
		double precioTotal = 0;
		for(int i = 0; i < publico.getInventario().size(); i++) {
			if(!publico.getInventario().get(i).isBought()) {
				precioTotal += publico.getInventario().get(i).getPrecio();
			}
		}
		return precioTotal;
	}
	
	private void escanearProductos(Publico publico) {
		for(int i = 0; i < publico.getInventario().size(); i++) {
			publico.getInventario().get(i).setPurchase();
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
