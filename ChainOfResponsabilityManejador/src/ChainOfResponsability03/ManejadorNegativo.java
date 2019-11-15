package ChainOfResponsability03;

public class ManejadorNegativo extends Manejador {

	public ManejadorNegativo() {

	}

	@Override
	public void comprobar(int numero) {
		// TODO Auto-generated method stub
		if (numero < 0) {
			System.out.println("El numero es negativo");
		}
	}

}
