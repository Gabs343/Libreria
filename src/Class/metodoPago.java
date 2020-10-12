package Class;

public interface metodoPago {
	
	public Billete entregar(Billete billete);
	
	public Tarjeta entregar(Tarjeta tarjeta);
	
	public void recibir(Billete billete);
	
	public void recibir(Tarjeta tarjeta);
	
}
