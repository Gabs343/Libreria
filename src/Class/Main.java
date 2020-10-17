package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Sucursal gaona = new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test01@gmail.com");*/
		
		Sucursal corrientes = new Sucursal("CABA", "Av Corrientes", 2500, 320, 1, 1134398765, "test02@gmail.com");
		Libreria libreria1 = new Libreria("La Libreria", corrientes);
		
		Empleado bob = new Empleado("Bob", "Gónzalez", "Encargado", 343);
		Publico carlos = new Publico("Carlos", "Lopez", "Literatura");
		
		bob.abrirSucursal(corrientes, bob);
		
		if(corrientes.isOpen()) {
			Sector matematica = new Sector("Matemática", "MAT");
			Sector literatura = new Sector("Literatura", "LIT");
			Sector historia = new Sector("Historia", "HIST");
			Sector informatica = new Sector("Informática", "INFORM");
			Sector caja = new Sector("Caja", "Caja");
			
			Estante estante1 = new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60);
			Estante estante2 = new Estante("Madera", "Marrón", "Rectangular", 30, 60, 180);
			
			corrientes.setSectorInPiso(0, matematica);
			corrientes.setSectorInPiso(0, informatica);
			corrientes.setSectorInPiso(1, literatura);
			corrientes.setSectorInPiso(1, historia);
			
			Producto libro1 = new Libro("Cuentos de amor, de locura y muerte", "Planeta", "PaperBack", "Drama", "Horacio Quiroga", "Español", 1, 500.0);
			
			literatura.añadirEstante(estante1);
			estante1.setProducto(libro1);
			
			bob.entrarSucursal(corrientes, bob);
			carlos.entrarSucursal(corrientes, carlos);
			Tarjeta tarjeta = new Tarjeta(carlos, "Debito", 1111222233334444L, 310822, 343, 9000);
			carlos.setTarjeta(tarjeta);
			
			carlos.changeToPiso(corrientes, bob, 1);
			
			carlos.searchProductoInEstante(estante1, "Cuentos de amor, de locura y muerte");
			carlos.changeToPiso(corrientes, bob, 0);
			
			bob.cobrar(carlos);

			carlos.salirSucursal(corrientes, carlos);
			
			bob.salirSucursal(corrientes, bob);
			bob.cerrarSucursal(corrientes, bob);
		}
		
		
	}

}
