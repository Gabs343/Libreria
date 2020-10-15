package Class;

public class Publico extends Persona{
	
	private String gusto;
	
	
	public Publico(int numero, String nombre, String apellido, String sexo , int fechaNacimiento, String nacionalidad, String gusto) {
		super(numero, nombre, apellido, sexo, fechaNacimiento, nacionalidad);
		this.gusto = gusto;
	}
	
	public String preguntar(Empleado empleado, String mensaje) {
		return mensaje;
	}
	
	public Producto entregar(Producto producto) {
		return producto;
	}

	
	public void botar() {
		
	}
	
	
	
}
