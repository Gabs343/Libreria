package Class;

public class Documento {
	private String nombre;
	private String apellido;
	private int fechaNacimiento;
	private String nacionalidad;
	private String sexo;
	private int numero;
	
	public Documento(int numero, String nombre, String apellido, String sexo, int fechaNacimiento, String nacionalidad) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}
}
