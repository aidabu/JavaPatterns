package Observer03;

public class UnObservador implements IObservador {

	private UnObservado objObservado;

	public UnObservador(UnObservado objObservado) {
		this.objObservado = objObservado;
		objObservado.agregarObservador(this);
	}

	@Override
	public void observadoActualizado() {
		// TODO Auto-generated method stub
		System.out.println("El valor del objeto Observado ha cambiado a [" + this.objObservado.getNumero() + "]");
	}

}
