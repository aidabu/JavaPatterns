package Mediator01;

public class ColegaConcreto1 extends Colega {

	public ColegaConcreto1(IMediador m) {
		this.setMediador(m);
	}
	
	@Override
	public void recibir(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("ColegaConcreto1: " + mensaje);
	}

}
