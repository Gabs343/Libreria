package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sucursal sucursal2 = new Sucursal("CABA", "Av Corrientes", 2500, 320, 2, 1134398765, "test02@gmail.com");
		Libreria libreria1 = new Libreria("La Libreria", sucursal2);
		
		Sucursal sucursal1 = new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test01@gmail.com");
		
		Sector sector1 = new Sector("Matem�tica", "MAT");
		Sector sector2 = new Sector("Literatura", "LIT");
		Sector sector3 = new Sector("Historia", "HIT");
		Sector sector4 = new Sector("Biolog�a", "BIO");
		Sector sector5 = new Sector("Inform�tica", "INT");
		
		Articulo estante1 = new Estante("Madera", "Marr�n", "Rectangular", 30, 89, 60, 5);
		Articulo estante2 = new Estante("Madera", "Marr�n", "Rectangular", 30, 60, 180, 9);
		
		Documento dniBob = new Documento(95343871, "Bob", "G�nzalez", "M", 310898, "Argentina");
 		Empleado bob = new Empleado(dniBob, "Encargado", 343);
		
		libreria1.A�adirSucursal(sucursal1);
		
		sucursal1.A�adirSector(sector1);
		sucursal1.A�adirSector(sector2);
		sucursal2.A�adirSector(sector3);
		sucursal2.A�adirSector(sector4);
		sucursal2.A�adirSector(sector5);
		
		sector1.A�adirArticulo(estante1);
		sector2.A�adirArticulo(estante2);
		sector3.A�adirArticulo(estante2);
		
		sucursal2.setSectorInPiso(1, sector3);
		sucursal2.setSectorInPiso(2, sector4);
		sucursal2.setSectorInPiso(0, sector5);
		
		bob.Saludar(0);
		libreria1.getSucursales();
		
	}

}
