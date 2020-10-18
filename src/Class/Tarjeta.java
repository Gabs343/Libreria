package Class;


public class Tarjeta {
	
	private String nombre; 
	private String apellido;
	private String tipo;
	private long numero;
	private int fechaVcto;
	private int codigoSeg;
	private double saldo;
	
	public Tarjeta(Persona persona, String tipo, long numero, int fechaVcto, int codigoSeg, double saldo) {
		this.tipo = tipo;
		this.numero = numero;
		this.fechaVcto = fechaVcto;
		this.codigoSeg = codigoSeg;
		this.saldo = saldo;
		nombre = persona.getNombre();
		apellido = persona.getApellido();
		
	}
	
	public boolean pasarTarjeta(double precioProducto) {
		boolean condicion = false;
		if(tipo.equalsIgnoreCase("Credito")) {
			int intentos = 0;
			while(intentos < 4) {
				int userInCodigo = 343;
				if(codigoSeg == userInCodigo) {
					descontarSaldo(precioProducto);
					condicion = true;
					break;
				}else {
					System.out.println("Contraseña Erronea");
					intentos++;
				}
			}
		}else {
			if(precioProducto > saldo) {
				System.out.println("No tienes suficiente saldo en tu cuenta");
			}else {
				descontarSaldo(precioProducto);
				condicion = true;
			}
			
		}
		return condicion;
	}
	
	private void descontarSaldo(double precio) {
		saldo -= precio;
		System.out.println("Se desconto " + precio + " de tu cuenta");
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
