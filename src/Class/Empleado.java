package Class;

import dvlib.Dialogo;

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
		Dialogo.mostrar("Hola mi nombre es " + nombre);
	}
	
	public void abrirSucursal(Sucursal sucursal) {
		sucursal.cambiarEstado(cargo, true);
	}
	
	public void cerrarSucursal(Sucursal sucursal) {
		sucursal.cambiarEstado(cargo, false);
	}
	
	public void entrarSucursal(Sucursal sucursal) {
		if(sucursal.isOpen()) {
			sucursal.setPersonaInPiso(this, 0);
			/*Dialogo.mostrar(nombre + " entro a la sucursal de " + sucursal.getDireccion());*/
		} else {
			Dialogo.mostrar("Esta cerrado");
		}
	}
	
	public void salirSucursal(Sucursal sucursal) {
		sucursal.removerPersonaInPiso(this);
		Dialogo.mostrar(nombre + " salio de la sucursal " + sucursal.getDireccion());
	}
	
	public void changeToPiso(Sucursal sucursal, int piso) {
		sucursal.removerPersonaInPiso(this);
		sucursal.setPersonaInPiso(this, piso);
		Dialogo.mostrar(nombre + " ingreso al piso " + piso);
	}
	
	
	public void cobrar(Sucursal sucursal, Publico publico, Caja caja) {
		int ans = Dialogo.ingresarEntero("1. Efectivo, 2. Tarjeta");
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
			Dialogo.mostrar("Debes elegir el método de pago");
			break;	
		}
		
	}
	
	private void metodoPagoEfectivo(Publico publico) {
		if(publico.getSaldo() >= getPrecioTotal(publico)) {
			publico.descontarSaldo(getPrecioTotal(publico));
			escanearProductos(publico);
		}else {
			Dialogo.mostrar(publico.getNombre() + " no tiene suficiente saldo");
		}
	}
	
	private void metodoPagoTarjeta(Publico publico, Tarjeta tarjeta) {
		if(tarjeta.pasarTarjeta(getPrecioTotal(publico))) {
			Dialogo.mostrar(nombre + " le cobro a " + publico.getNombre() + " con exito");
			escanearProductos(publico);
			
		}else {
			Dialogo.mostrar("La tarjeta no paso");
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
