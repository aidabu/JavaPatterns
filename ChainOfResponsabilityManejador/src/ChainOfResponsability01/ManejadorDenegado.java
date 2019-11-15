package ChainOfResponsability01;

public class ManejadorDenegado extends Manejador {

	public ManejadorDenegado() {
		
	}
	
	@Override
	public void comprobar(String estado) {
		// TODO Auto-generated method stub
		if((estado != null) && (estado.equalsIgnoreCase("DENEGADO") == true)) {
			System.out.println("Solicitud denegada");
		} else {
			if(this.getSiguiente() != null) {
				//Llamamos al metodo en el siguiente objeto
				this.getSiguiente().comprobar(estado);
			}
		}
	}

}
