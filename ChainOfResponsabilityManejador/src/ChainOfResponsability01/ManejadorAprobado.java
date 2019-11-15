package ChainOfResponsability01;

public class ManejadorAprobado extends Manejador {
	
	public ManejadorAprobado() {
		
	}

	@Override
	public void comprobar(String estado) {
		// TODO Auto-generated method stub
		if( (estado != null) && (estado.equalsIgnoreCase("APROBADO") == true) ) {
			System.out.println("Solicitud aprobada");
		} else {
			if(this.getSiguiente() != null) {
				//Llamamos al metodo en el siguiente objeto
				this.getSiguiente().comprobar(estado);
			}
		}
	}

}
