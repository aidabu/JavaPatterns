package Bridge01;

public abstract class ElaborarAlimento {

	//Referencia al Implementador
	IElaborar implementador;
	
	String nombre;
	
	public IElaborar getImplementador() {
		return this.implementador;
	}
	
	public void setImplementador(IElaborar implementador) {
		this.implementador = implementador;
	}
	
	//Metodo a implementar por las clases que hereden
	public abstract void obtener();
}
