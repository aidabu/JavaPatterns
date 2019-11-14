package AbstractFactory;

public class ComponentesAzules implements Componentes {
	
	public ComponentesAzules() {
		
	}

	@Override
	public Boton getBoton() {
		// TODO Auto-generated method stub
		return new BotonAzul();
	}

	@Override
	public Lista getLista() {
		// TODO Auto-generated method stub
		return new ListaAzul();
	}

}
