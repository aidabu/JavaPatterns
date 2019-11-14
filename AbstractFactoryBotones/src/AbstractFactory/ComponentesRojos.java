package AbstractFactory;

public class ComponentesRojos implements Componentes {

	public ComponentesRojos() {
		
	}

	@Override
	public Boton getBoton() {
		// TODO Auto-generated method stub
		return new BotonRojo();
	}

	@Override
	public Lista getLista() {
		// TODO Auto-generated method stub
		return new ListaRoja();
	}
}