package Class;

public interface Persona {
	public String getNombre();
	
	public String getApellido();
	
	public void entrarSucursal(Sucursal sucursal);

	public void salirSucursal(Sucursal sucursal);

	public void changeToPiso(Sucursal sucursal, int piso);
}
