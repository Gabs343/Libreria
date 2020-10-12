package Class;
import java.util.ArrayList;

public class Publico implements metodoPago {
	
	public String gusto;
	
	ArrayList <Producto> compras = new ArrayList <>();
	ArrayList <Billete> billete = new ArrayList <>();
	ArrayList <Tarjeta> tarjeta = new ArrayList <>();
	ArrayList <Producto> bolsa = new ArrayList <>();
	ArrayList <Comprobante> comprobante = new ArrayList<>();
	
	public String preguntar(Empleado empleado, String mensaje) {
		
	}
	
	public Producto entregar(Producto producto) {
		
	}
	
	@Override
	public Billete entregar(Billete billete) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarjeta entregar(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recibir(Billete billete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibir(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void recibir(Producto producto, Ticket ticket) {
		
	}
	
	
	public void entrar(Sucursal sucursal) {
		
	}
	
	public void salir(Sucursal sucursal) {
		
	}
	
	public void buscar(Producto producto) {
		
	}
	
	public void agarrar(Producto producto) {
		
	}
	
	public void colocar(Producto producto) {
		
	}
	
	public void guardar(Producto producto) {
		
	}
	
	public void botar() {
		
	}
	
	
	
}
