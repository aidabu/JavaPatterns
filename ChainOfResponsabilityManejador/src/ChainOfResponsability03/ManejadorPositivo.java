package ChainOfResponsability03;

public class ManejadorPositivo extends Manejador {
	
	public ManejadorPositivo() {
		
	}

	@Override
	public void comprobar(int numero) {
		// TODO Auto-generated method stub
		if( numero > 0 ) {
			System.out.println("El numero es positivo");
		}
	}

}
