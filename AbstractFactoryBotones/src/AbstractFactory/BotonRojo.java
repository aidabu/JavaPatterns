package AbstractFactory;

public class BotonRojo extends Boton {

	public BotonRojo() {
		this.configurar();
	}
	
	@Override
	public void configurar() {
		// TODO Auto-generated method stub
		System.out.println("Configurando el BOTON con el borde ROJO");
	}

}
