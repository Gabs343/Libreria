package Class;

public class Empleado extends Documento{
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
}
