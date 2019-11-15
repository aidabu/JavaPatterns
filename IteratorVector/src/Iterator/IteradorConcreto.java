package Iterator;

public class IteradorConcreto implements Iterador {
	
	private AgregadoConcreto agregado;
	private int posicion_actual = 0;
	
	public IteradorConcreto(AgregadoConcreto agregado) {
		this.agregado = agregado;
	}

	@Override
	public Object primero() {
		// TODO Auto-generated method stub
		Object obj = null;
		
		if(this.agregado.aDatos.isEmpty() == false) {
			this.posicion_actual = 0;
			obj = this.agregado.aDatos.firstElement();
		}
		return obj;
	}

	@Override
	public Object siguiente() {
		// TODO Auto-generated method stub
		Object obj = null;
		
		if((this.posicion_actual) < this.agregado.aDatos.size()) {
			obj = this.agregado.aDatos.elementAt(this.posicion_actual);
			this.posicion_actual = this.posicion_actual + 1;
		}
		return obj;
	}

	@Override
	public boolean hayMas() {
		// TODO Auto-generated method stub
		boolean ok = false;
		
		if(this.posicion_actual < (this.agregado.aDatos.size())) {
			ok = true;
		}
		return ok;
	}

	@Override
	public Object actual() {
		// TODO Auto-generated method stub
		Object obj = null;
		
		if(this.posicion_actual < this.agregado.aDatos.size()) {
			obj = this.agregado.aDatos.elementAt(this.posicion_actual);
		}
		return obj;
	}

}
