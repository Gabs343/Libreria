package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sucursal sucursal2 = new Sucursal("CABA", "Av Corrientes", 2500, 320, 2, 1134398765, "test02@gmail.com");
		Libreria libreria1 = new Libreria("La Libreria", sucursal2);
		
		Sucursal sucursal1 = new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test01@gmail.com");
		
		Sector sector1 = new Sector("Matemática", "MAT");
		Sector sector2 = new Sector("Literatura", "LIT");
		Sector sector3 = new Sector("Historia", "HIT");
		Sector sector4 = new Sector("Biología", "BIO");
		Sector sector5 = new Sector("Informática", "INT");
		
		Articulo estante1 = new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60, 5);
		Articulo estante2 = new Estante("Madera", "Marrón", "Rectangular", 30, 60, 180, 9);
		
		Documento dniBob = new Documento(95343871, "Bob", "Gónzalez", "M", 310898, "Argentina");
 		Empleado bob = new Empleado(dniBob, "Encargado", 343);
		
		libreria1.AñadirSucursal(sucursal1);
		
		sucursal1.AñadirSector(sector1);
		sucursal1.AñadirSector(sector2);
		sucursal2.AñadirSector(sector3);
		sucursal2.AñadirSector(sector4);
		sucursal2.AñadirSector(sector5);
		
		sector1.AñadirArticulo(estante1);
		sector2.AñadirArticulo(estante2);
		sector3.AñadirArticulo(estante2);
		
		sucursal2.setSectorInPiso(1, sector3);
		sucursal2.setSectorInPiso(2, sector4);
		sucursal2.setSectorInPiso(0, sector5);
		
		bob.Saludar(0);
		libreria1.getSucursales();
		
	}

}
