package Mediator02;

public class Componente {

	protected Mediador m;

	public Componente() {
	}

	public Mediador getMediador() {
		return this.m;
	}

	public void setMediador(Mediador m) {
		this.m = m;
	}
}
