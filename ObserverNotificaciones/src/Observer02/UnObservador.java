package Observer02;

public class UnObservador implements IObservador {

	public UnObservador() {

	}

	@Override
	public void observadoActualizado(Observado objObservado, Object valor) {
		// TODO Auto-generated method stub
		System.out.println("El valor del objeto ha cambiado a [" + ((String) valor) + "]");
	}

}
