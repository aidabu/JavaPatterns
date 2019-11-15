package ChainOfResponsability03;

public class ManejadorRangoPositivo extends Manejador {
	
	public ManejadorRangoPositivo() {
		
	}

	@Override
	public void comprobar(int numero) {
		// TODO Auto-generated method stub
		if(numero > 0 && numero <= 50) {
			System.out.println("El numero esta entre 1 y 50");
		}
	}

}
