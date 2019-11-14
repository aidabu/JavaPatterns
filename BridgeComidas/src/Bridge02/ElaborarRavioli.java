package Bridge02;

public class ElaborarRavioli extends ElaborarPasta {
	
	public ElaborarRavioli(IElaborar implementador) {
		this.setImplementador(implementador);
	}

	@Override
	public void obtener() {
		// TODO Auto-generated method stub

		System.out.println("Preparando raviolis...");
		this.getImplementador().procesar();
	}

}
