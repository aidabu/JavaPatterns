package Adapter02;

public class Adaptador extends CajaEuros implements IAdaptador {
		
	public Adaptador() {
		
	}

	@Override
	public void sacarPesetas(double pesetas) {
		// TODO Auto-generated method stub
		double euros = pesetas / 166.386;
		this.sacarEuros(euros);
	}

	@Override
	public void ingresarPesetas(double pesetas) {
		// TODO Auto-generated method stub
		double euros = pesetas / 166.386;
		this.ingresarEuros(euros);
	}

}
