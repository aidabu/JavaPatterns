package Builder;

public class ConstructorCocheMedio extends BuilderCoche {
	
	public ConstructorCocheMedio() {
		
	}

	@Override
	public void construirMotor() {
		// TODO Auto-generated method stub
		this.coche.setMotor("Motor de potencia media");
	}

	@Override
	public void construirCarroceria() {
		// TODO Auto-generated method stub
		this.coche.setCarroceria("Carroceria de proteccion media");
	}

	@Override
	public void construirAireAcond() {
		// TODO Auto-generated method stub
		this.coche.setAireAcond(false);
	}

	@Override
	public void construirElevalunas() {
		// TODO Auto-generated method stub
		this.coche.setElevalunasElec(true);
	}

}
