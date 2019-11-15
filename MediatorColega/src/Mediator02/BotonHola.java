package Mediator02;

public class BotonHola extends Componente {

	public BotonHola() {
	}

	public void clickHola() {
		this.getMediador().clickHola();
	}
}
