package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sucursal corrientes = new Sucursal("CABA", "Av Corrientes", 2500, 320, 1, 1134398765, "test02@gmail.com");
		Libreria libreria1 = new Libreria("La Libreria", corrientes);
		
		Sucursal gaona = new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test01@gmail.com");
		
		Sector sector1 = new Sector("Matem�tica", "MAT");
		Sector sector2 = new Sector("Literatura", "LIT");
		Sector sector3 = new Sector("Historia", "HIT");
		Sector sector4 = new Sector("Biolog�a", "BIO");
		Sector sector5 = new Sector("Inform�tica", "INT");
		
		Articulo estante1 = new Estante("Madera", "Marr�n", "Rectangular", 30, 89, 60, 5);
		Articulo estante2 = new Estante("Madera", "Marr�n", "Rectangular", 30, 60, 180, 9);
		
 		Empleado bob = new Empleado(95343871, "Bob", "G�nzalez", "M", 310898, "Argentina", "Encargado", 343);
		
		libreria1.a�adirSucursal(gaona);
		
		gaona.a�adirSector(sector1);
		gaona.a�adirSector(sector2);
		corrientes.a�adirSector(sector3);
		corrientes.a�adirSector(sector4);
		corrientes.a�adirSector(sector5);
		
		sector1.a�adirArticulo(estante1);
		sector2.a�adirArticulo(estante2);
		sector3.a�adirArticulo(estante2);
	
		corrientes.setSectorInPiso(0, sector1);
		
		bob.Saludar();
		libreria1.getSucursales();
		
	}

}
