package Command;

public class Receptor {

	public void accion(String accion) {
		if(accion.compareTo("ABRIR") == 0) {
			System.out.println("Abrir documento");
		} else if(accion.compareTo("IMPRIMIR") == 0) {
			System.out.println("Imprimir documento");
		} else if(accion.compareTo("SALIR") == 0) {
			System.out.println("Salir del programa");
		} else {
			System.out.println("Opcion no valida");
		}
	}
}
