package Bridge02;

public class ElaborarLasagna extends ElaborarPasta {

	public ElaborarLasagna(IElaborar implementador) {
		this.setImplementador(implementador);
	}
	
	@Override
	public void obtener() {
		// TODO Auto-generated method stub
		System.out.println("Preparando lasagna...");
		this.getImplementador().procesar();
	}

}
