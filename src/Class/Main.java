package Class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libreria libreria1 = new Libreria("La Libreria", new Sucursal("CABA", "Av Corrientes", 2500, 320, 1, 1134398765, "test01@gmail.com"));
		libreria1.añadirSucursal(new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test02@gmail.com"));
		
		Empleado bob = new Empleado("Bob", "Gónzalez", "Encargado", 343);
		Publico carlos = new Publico("Carlos", "Lopez", "Literatura", 0);
		
		bob.abrirSucursal(libreria1.getSucursal("Av Corrientes"));
		bob.entrarSucursal(libreria1.getSucursal("Av Corrientes"));
		carlos.entrarSucursal(libreria1.getSucursal("Av Corrientes"));
			
		if(libreria1.getSucursal("Av Corrientes").isOpen()) {
			
			libreria1.getSucursal("Av Corrientes").setSectorInPiso(0, new Sector("Caja"));
			libreria1.getSucursal("Av Corrientes").setSectorInPiso(0, new Sector("Matemática"));
			libreria1.getSucursal("Av Corrientes").setSectorInPiso(0, new Sector("Informática"));
			libreria1.getSucursal("Av Corrientes").setSectorInPiso(1, new Sector("Terror"));
			libreria1.getSucursal("Av Corrientes").setSectorInPiso(1, new Sector("Historia"));
			
			libreria1.getSucursal("Av Corrientes").setEstanteInSector(1, "Terror", new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60));
			libreria1.getSucursal("Av Corrientes").setEstanteInSector(1, "Terror", new Estante("Madera", "Marrón", "Rectangular", 30, 60, 180));
			
			libreria1.getSucursal("Av Corrientes").getPiso(1).getSector("Terror").getEstante(1).setProducto(new Libro("Terror", "Stephen King", "It", 2400));
			
			carlos.setTarjeta(new Tarjeta(carlos, "Debito", 1111222233334444L, 310822, 343, 9000));
			
			carlos.changeToPiso(libreria1.getSucursal("Av Corrientes"), 1);
			
			carlos.enterSector(libreria1.getSucursal("Av Corrientes").getPiso(1).getSector("Terror"));
			
			carlos.searchProductoInEstante(libreria1.getSucursal("Av Corrientes").getPiso(1).getSector("Terror").getEstante(1), "It");
			
			carlos.exitSector(libreria1.getSucursal("Av Corrientes").getPiso(1).getSector("Terror"));
			
			carlos.changeToPiso(libreria1.getSucursal("Av Corrientes"), 0);
			
			bob.cobrar(libreria1.getSucursal("Av Corrientes"), carlos, libreria1.getSucursal("Av Corrientes").getCaja());
			
			carlos.consultarCuentaTarjeta();

			carlos.salirSucursal(libreria1.getSucursal("Av Corrientes"));
			
			bob.salirSucursal(libreria1.getSucursal("Av Corrientes"));
			bob.cerrarSucursal(libreria1.getSucursal("Av Corrientes"));
		}
		
		
	}

}
