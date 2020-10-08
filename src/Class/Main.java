package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sucursal corrientes = new Sucursal("CABA", "Av Corrientes", 2500, 320, 1, 1134398765, "test02@gmail.com");
		Libreria libreria1 = new Libreria("La Libreria", corrientes);
		
		Sucursal gaona = new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test01@gmail.com");
		
		Sector sector1 = new Sector("Matemática", "MAT");
		Sector sector2 = new Sector("Literatura", "LIT");
		Sector sector3 = new Sector("Historia", "HIT");
		Sector sector4 = new Sector("Biología", "BIO");
		Sector sector5 = new Sector("Informática", "INT");
		
		Articulo estante1 = new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60, 5);
		Articulo estante2 = new Estante("Madera", "Marrón", "Rectangular", 30, 60, 180, 9);
		
 		Empleado bob = new Empleado(95343871, "Bob", "Gónzalez", "M", 310898, "Argentina", "Encargado", 343);
		
		libreria1.añadirSucursal(gaona);
		
		gaona.añadirSector(sector1);
		gaona.añadirSector(sector2);
		corrientes.añadirSector(sector3);
		corrientes.añadirSector(sector4);
		corrientes.añadirSector(sector5);
		
		sector1.añadirArticulo(estante1);
		sector2.añadirArticulo(estante2);
		sector3.añadirArticulo(estante2);
	
		corrientes.setSectorInPiso(0, sector1);
		
		bob.Saludar();
		libreria1.getSucursales();
		
	}

}
