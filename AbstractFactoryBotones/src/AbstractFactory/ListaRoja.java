package AbstractFactory;

public class ListaRoja extends Lista {

	public ListaRoja() {
		this.configurar();
	}
	
	@Override
	public void configurar() {
		// TODO Auto-generated method stub
		System.out.println("Configurando la LISTA con borde ROJO");
	}

}
