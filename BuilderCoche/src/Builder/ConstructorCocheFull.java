package Builder;

public class ConstructorCocheFull extends BuilderCoche {
	
	public ConstructorCocheFull() {
		
	}

	@Override
	public void construirMotor() {
		// TODO Auto-generated method stub
		this.coche.setMotor("Motor de potencia alta");
	}

	@Override
	public void construirCarroceria() {
		// TODO Auto-generated method stub
		this.coche.setCarroceria("Carroceria de alta proteccion");
	}

	@Override
	public void construirAireAcond() {
		// TODO Auto-generated method stub
		this.coche.setAireAcond(true);
	}

	@Override
	public void construirElevalunas() {
		// TODO Auto-generated method stub
		this.coche.setElevalunasElec(true);
	}

}
