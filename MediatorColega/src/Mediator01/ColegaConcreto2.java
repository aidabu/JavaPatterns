package Mediator01;

public class ColegaConcreto2 extends Colega {

	public ColegaConcreto2(IMediador m) {
		this.setMediador(m);
	}
	
	@Override
	public void recibir(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("ColegaConcreto2: " + mensaje);
	}

}
