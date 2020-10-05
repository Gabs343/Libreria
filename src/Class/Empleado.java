package Class;

import java.util.ArrayList;

public class Empleado {
	private String cargo;
	private int id;
	
	private ArrayList<Documento> documentos = new ArrayList<Documento>();
	
	public Empleado(Documento documento, String cargo, int id) {
		documentos.add(documento);
		this.cargo = cargo;
		this.id = id;
	}
	
	public void Saludar(int numero) {
		System.out.println("Hola mi nombre es " + documentos.get(numero).getNombre());
	}
}
