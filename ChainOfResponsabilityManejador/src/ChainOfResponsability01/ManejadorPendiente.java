package ChainOfResponsability01;

public class ManejadorPendiente extends Manejador {
	
	public ManejadorPendiente() {
		
	}

	@Override
	public void comprobar(String estado) {
		// TODO Auto-generated method stub
		if(estado == null) {
			System.out.println("Solicitud pendiente");
		} else {
			if(this.getSiguiente() != null) {
				//Llamamos al metodo en el siguiente objeto
				this.getSiguiente().comprobar(estado);
			}
		}
	}

}
