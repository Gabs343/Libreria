package Class;

public interface Persona {
	public String getNombre();
	
	public String getApellido();
	
	public void entrarSucursal(Sucursal sucursal, Persona persona);

	public void salirSucursal(Sucursal sucursal, Persona persona);

	public void changeToPiso(Sucursal sucursal, Persona persona, int piso);
}
