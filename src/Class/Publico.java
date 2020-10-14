package Class;
import java.util.ArrayList;

public class Publico extends Persona{
	
	public String gusto;
	
	ArrayList <Billete> billete = new ArrayList <Billete>();
	ArrayList <Tarjeta> tarjeta = new ArrayList <Tarjeta>();
	ArrayList <Comprobante> comprobante = new ArrayList<Comprobante>();
	
	public Publico(int numero, String nombre, String apellido, String sexo , int fechaNacimiento, String nacionalidad, String gusto) {
		super(numero, nombre, apellido, sexo, fechaNacimiento, nacionalidad);
		this.gusto = gusto;
	}
	
	public String preguntar(Empleado empleado, String mensaje) {
		return "hola";
	}
	
	public Producto entregar(Producto producto) {
		return producto;
	}
	
	public void recibir(Producto producto, Ticket ticket) {
		
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
