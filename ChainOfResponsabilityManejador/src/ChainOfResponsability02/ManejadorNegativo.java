package ChainOfResponsability02;

public class ManejadorNegativo extends Manejador {

	public ManejadorNegativo() {

	}

	@Override
	public void comprobar(int numero) {
		// TODO Auto-generated method stub
		if (numero < 0) {
			System.out.println("El numero es negativo");
		}
		if (this.getSiguiente() != null) {
			// Llamamos al metodo en el siguiente objeto
			this.getSiguiente().comprobar(numero);
		}

	}

}
