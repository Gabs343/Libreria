package Class;

public class Comprobante {

	private int serial;
	private String nombreComprador;
	private int fecha;
	private String tipoTarjeta;
	private double saldo;
	
	public Comprobante(int serial, String nombreComprador, int fecha, String tipoTarjeta, double saldo) {
		this.serial = serial;
		this.nombreComprador = nombreComprador;
		this.fecha = fecha;
		this.tipoTarjeta = tipoTarjeta;
	}
}
