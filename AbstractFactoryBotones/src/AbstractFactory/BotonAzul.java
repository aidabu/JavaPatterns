package AbstractFactory;

public class BotonAzul extends Boton {

	public BotonAzul() {
		this.configurar();
	}
	
	@Override
	public void configurar() {
		// TODO Auto-generated method stub
		System.out.println("Configurando el BOTON con borde AZUL");
	}

}
