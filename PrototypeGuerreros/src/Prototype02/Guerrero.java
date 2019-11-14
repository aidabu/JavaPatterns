package Prototype02;

public class Guerrero extends Enemigo {
	
	public Guerrero() {
		System.out.println("Guerrero creado");
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		System.out.println("El guerrero ataca");
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("El guerrero se detiene");
	}

}
