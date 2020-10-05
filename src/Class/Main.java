package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libreria libreria1 = new Libreria("La Libreria");
		
		Sucursal sucursal1 = new Sucursal("CABA", "Av Gaona", 1500, 318, 1, 1134398765, "test01@gmail.com");
		
		Sector sector1 = new Sector("Matem�tica", "MAT");
		Sector sector2 = new Sector("Literatura", "LIT");
		
		Articulo estante1 = new Estante("Madera", "Marr�n", "Rectangular", 30, 89, 60, 5);
		Articulo estante2 = new Estante("Madera", "Marr�n", "Rectangular", 30, 60, 180, 9);
		
		Documento dniBob = new Documento(95343871, "Bob", "G�nzalez", "M", 310898, "Argentina");
 		Empleado bob = new Empleado(dniBob, "Encargado", 343);
		
		libreria1.A�adirSucursal(sucursal1);
		
		sucursal1.A�adirSector(sector1);
		sucursal1.A�adirSector(sector2);
		
		sector1.A�adirArticulo(estante1);
		
		bob.Saludar(0);
			
		
	}

}
