package Mediator01;

public class ColegaConcreto3 extends Colega {

	public ColegaConcreto3(IMediador m) {
		this.setMediador(m);
	}
	
	@Override
	public void recibir(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("ColegaConcreto3: " + mensaje);
	}

}
