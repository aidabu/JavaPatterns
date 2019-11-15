package ChainOfResponsability02;

public class ManejadorPositivo extends Manejador {
	
	public ManejadorPositivo() {
		
	}

	@Override
	public void comprobar(int numero) {
		// TODO Auto-generated method stub
		if( numero > 0 ) {
			System.out.println("El numero es positivo");
		}
		if(this.getSiguiente() != null) {
				this.getSiguiente().comprobar(numero);
		}
	}

}
