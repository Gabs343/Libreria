package Class;

import dvlib.Dialogo;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libreria libreria1 = new Libreria("La Libreria", new Sucursal("CABA", "Av Corrientes", 2500, 320, 1, 1134398765, "test01@gmail.com"));
		libreria1.añadirSucursal(new Sucursal("CABA", "Av Gaona", 1500, 318, 0, 1134398765, "test02@gmail.com"));
		
		Empleado bob = new Empleado("Bob", "Gónzalez", "Encargado", 343);
		Publico carlos = new Publico("Carlos", "Lopez", 0);
		carlos.setTarjeta(new Tarjeta(carlos, "Debito", 1111222233334444L, 310822, 343, 9000));
		
		String irALibreria = Dialogo.ingresarCadena("¿Quieres ir a una libreria? Y/N");
		
		if(irALibreria.equalsIgnoreCase("Y")) {
			String nombreSucursal = Dialogo.ingresarCadena("Escribe el nombre de la sucursal que quieres ir \n" + libreria1.getSucursales()); 
			bob.abrirSucursal(libreria1.getSucursal(nombreSucursal));
			bob.entrarSucursal(libreria1.getSucursal(nombreSucursal));
			
			switch(nombreSucursal) {
			case "Av Corrientes":
				libreria1.getSucursal(nombreSucursal).setSectorInPiso(0, new Sector("Caja"));
				libreria1.getSucursal(nombreSucursal).setSectorInPiso(0, new Sector("Matemática"));
				libreria1.getSucursal(nombreSucursal).setSectorInPiso(0, new Sector("Informática"));
				libreria1.getSucursal(nombreSucursal).setSectorInPiso(1, new Sector("Terror"));
				libreria1.getSucursal(nombreSucursal).setSectorInPiso(1, new Sector("Historia"));
				
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(0, "Matemática", new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60));
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(0, "Matemática", new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60));
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(0, "Informática", new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60));
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(0, "Informática", new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60));
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(1, "Terror", new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60));
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(1, "Terror", new Estante("Madera", "Marrón", "Rectangular", 45, 70, 80));
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(1, "Historia", new Estante("Madera", "Marrón", "Rectangular", 30, 60, 180));
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(1, "Historia", new Estante("Madera", "Marrón", "Rectangular", 30, 60, 180));
				
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Matemática").getEstante(1).setProducto(new Libro("Matemática", "Aurelio Baldor", "Álgebra de Baldor", 1500));
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Matemática").getEstante(1).setProducto(new Libro("Matemática", "James Stewar", "Precálculo: matemáticas para el cálculo", 850));
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Matemática").getEstante(1).setProducto(new Libro("Matemática", " Eduardo Sáenz", "Apocalipsis matemático", 600));
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Informática").getEstante(1).setProducto(new Libro("Informática", "Steven Holzner", "Biblia de java", 953));
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Informática").getEstante(1).setProducto(new Libro("Informática", "Robert C. Martin", "Código Limpio", 1753));
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Informática").getEstante(2).setProducto(new Libro("Informática", "Luis Joyanes Aguilar", "Fundamentos de programación", 1155));
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Informática").getEstante(2).setProducto(new Libro("Informática", "Alfonso Jiménez Marín", "Aprende a programar con Java", 789));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Historia").getEstante(1).setProducto(new Libro("Historia", "Norman Stone", "Primera guerra mundial", 913));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Historia").getEstante(2).setProducto(new Libro("Historia", "Maurice Druon", "Los Reyes Malditos 1", 1000));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Historia").getEstante(2).setProducto(new Libro("Historia", "Maurice Druon", "Los Reyes Malditos 2", 1300));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Historia").getEstante(2).setProducto(new Libro("Historia", "Maurice Druon", "Los Reyes Malditos 3", 1600));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Historia").getEstante(1).setProducto(new Libro("Historia", "Jesus Hernandez", "Operación Valkiria", 637));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Terror").getEstante(1).setProducto(new Libro("Terror", "Stephen King", "It", 2400));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Terror").getEstante(1).setProducto(new Libro("Terror", "Stephen King", "El Resplandor", 1300));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Terror").getEstante(2).setProducto(new Libro("Terror", "Edgar Allan Poe", "El Gato Negro", 518));
				libreria1.getSucursal(nombreSucursal).getPiso(1).getSector("Terror").getEstante(2).setProducto(new Libro("Terror", "Bram Stoker", "Drácula", 2400));
				break;
				
			case "Av Gaona":
				libreria1.getSucursal(nombreSucursal).setSectorInPiso(0, new Sector("Caja"));
				libreria1.getSucursal(nombreSucursal).setSectorInPiso(0, new Sector("Astronomía"));
				
				libreria1.getSucursal(nombreSucursal).setEstanteInSector(0, "Astronomía", new Estante("Madera", "Marrón", "Rectangular", 30, 89, 60));
				
				libreria1.getSucursal(nombreSucursal).getPiso(0).getSector("Matemática").getEstante(1).setProducto(new Libro("Astronomía", "Gabriel López", "¿Como ir a la luna?", 343));
				break;
			}
			
			carlos.entrarSucursal(libreria1.getSucursal(nombreSucursal));
			
			int numeroDePiso = 0;
			String nombreSector = Dialogo.ingresarCadena("En este piso cuentas con los sectores" + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSectores() + "\n* Escaleras\n* Salir. \nEscribe al lugar a donde quieres ir");
			
			
			while(!nombreSector.equalsIgnoreCase("Salir")) {
				
				while(!nombreSector.equalsIgnoreCase("Escaleras") && !nombreSector.equalsIgnoreCase("Salir")) {
					if(!libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSector(nombreSector).getPersona().equalsIgnoreCase(carlos.getNombre())) {
						carlos.enterSector(libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSector(nombreSector));
					}
					
					if(nombreSector.equalsIgnoreCase("Caja")) {
						
						bob.cobrar(libreria1.getSucursal(nombreSucursal), carlos, libreria1.getSucursal(nombreSucursal).getCaja());
						carlos.exitSector(libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSector(nombreSector));
						nombreSector = Dialogo.ingresarCadena("En este piso cuentas con los sectores " + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSectores() + "\n* Escaleras\n* Salir. \nEscribe al sector que quieres ir");	
						
					}else {
						
						int numeroDeEstante = Dialogo.ingresarEntero("Este sector cuenta con " + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSector(nombreSector).getEstantes() + " estantes. ¿Cual estante quieres revisar?");
						Dialogo.mostrar("Este estante cuenta con los libros " + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSector(nombreSector).getEstante(numeroDeEstante).getProductos());
					
						String nombreLibro = Dialogo.ingresarCadena("Escribe el nombre del libro que te gustaria guardar");
						carlos.searchProductoInEstante(libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSector(nombreSector).getEstante(numeroDeEstante), nombreLibro);
						
						String seguirEnSector = Dialogo.ingresarCadena("¿Quieres buscar en otro estante? Y/N");
						
						if(seguirEnSector.equalsIgnoreCase("N")) {
							carlos.exitSector(libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSector(nombreSector));
							
							if(numeroDePiso == 0) {
								nombreSector = Dialogo.ingresarCadena("En este piso cuentas con los sectores " + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSectores() + "\n* Escaleras\n* Salir. \nEscribe al sector que quieres ir");	
							}else {
								nombreSector = Dialogo.ingresarCadena("En este piso cuentas con los sectores " + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSectores() + "\n* Escaleras. \nEscribe al sector que quieres ir");	
							}
							
						}
						
					}
				}
				
				while(nombreSector.equalsIgnoreCase("Escaleras")) {
					numeroDePiso = Dialogo.ingresarEntero("La libreria cuenta con " + libreria1.getSucursal(nombreSucursal).getPisos() + " pisos. ¿A que piso te gustaria ir?\n");
					carlos.changeToPiso(libreria1.getSucursal(nombreSucursal), numeroDePiso);
					
					if(numeroDePiso == 0) {
						nombreSector = Dialogo.ingresarCadena("En este piso cuentas con los sectores " + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSectores() + "\n* Escaleras\n* Salir. \nEscribe al sector que quieres ir");	
					}else {
						nombreSector = Dialogo.ingresarCadena("En este piso cuentas con los sectores " + libreria1.getSucursal(nombreSucursal).getPiso(numeroDePiso).getSectores() + "\n* Escaleras. \nEscribe al sector que quieres ir");	
					}
					
				}
				
				
			}
			
			carlos.salirSucursal(libreria1.getSucursal(nombreSucursal));
			
			bob.salirSucursal(libreria1.getSucursal(nombreSucursal));
			bob.cerrarSucursal(libreria1.getSucursal(nombreSucursal));

		}
	}

}
