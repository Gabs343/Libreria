package Class;

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
	
	public void Saludar() {
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
			System.out.println("Entraste a la sucursal de " + sucursal.getDireccion());
		} else {
			System.out.println("Esta cerrado");
		}
	}
	
	public void salirSucursal(Sucursal sucursal, Persona persona) {
		sucursal.removePersona(persona);
		System.out.println("Saliste de la sucursal " + sucursal.getDireccion());	
	}
	
	public void changeToPiso(Sucursal sucursal, Persona persona, int piso) {
		sucursal.removePersonaInPiso(persona);
		sucursal.setPersonaInPiso(persona, piso);
		System.out.println("Ingresaste al piso " + piso);
	}
	
	
	public void Cobrar(Publico publico, String nombreProducto) {
		
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
