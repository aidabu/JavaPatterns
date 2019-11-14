package Builder;

public class ConstructorCocheBase extends BuilderCoche {
	
	public ConstructorCocheBase() {
		
	}

	@Override
	public void construirMotor() {
		// TODO Auto-generated method stub
		this.coche.setMotor("Motor de potencia minima");
	}

	@Override
	public void construirCarroceria() {
		// TODO Auto-generated method stub
		this.coche.setCarroceria("Carroceria de baja proteccion");
	}

	@Override
	public void construirAireAcond() {
		// TODO Auto-generated method stub
		this.coche.setAireAcond(false);
	}

	@Override
	public void construirElevalunas() {
		// TODO Auto-generated method stub
		this.coche.setElevalunasElec(false);
	}

}
