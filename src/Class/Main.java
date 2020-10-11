package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Sucursal gaona = new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test01@gmail.com");*/
		
		Sucursal corrientes = new Sucursal("CABA", "Av Corrientes", 2500, 320, 1, 1134398765, "test02@gmail.com");
		Libreria libreria1 = new Libreria("La Libreria", corrientes);
		
		Empleado bob = new Empleado(95343871, "Bob", "Gónzalez", "M", 310898, "Argentina", "Encargado", 343);
		
		bob.abrirSucursal(corrientes, bob);
		
		if(corrientes.isOpen()) {
			Sector matematica = new Sector("Matemática", "MAT");
			Sector literatura = new Sector("Literatura", "LIT");
			Sector historia = new Sector("Historia", "HIST");
			Sector biologia = new Sector("Biología", "BIO");
			Sector informatica = new Sector("Informática", "INFORM");
			
			Estante estante1 = new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60, 5);
			Estante estante2 = new Estante("Madera", "Marrón", "Rectangular", 30, 60, 180, 9);
			
			corrientes.setSectorInPiso(0, matematica);
			corrientes.setSectorInPiso(0, informatica);
			corrientes.setSectorInPiso(1, literatura);
			corrientes.setSectorInPiso(1, historia);
			
			Producto libro1 = new Libro("Cuentos de amor, de locura y muerte", "Planeta", "PaperBack", "Drama", "Horacio Quiroga", "Español", 1, 137, 500);
			
			literatura.añadirArticulo(estante1);
			estante1.setProducto(libro1);
			
			bob.entrarSucursal(corrientes, bob);
			
			corrientes.getSectoresInPiso(0);
			
			bob.changeToPiso(corrientes, bob, 1);
			
			corrientes.getSectoresInPiso(1);
			
			bob.searchProductoInEstante(estante1, "Cuentos de amor, de locura y muerte");
			bob.savingProductoInEstante(estante1, "Cuentos de amor, de locura y muerte");
			bob.changeToPiso(corrientes, bob, 0);
			bob.salirSucursal(corrientes, bob);
			bob.cerrarSucursal(corrientes, bob);
		}
		
		
	}

}
