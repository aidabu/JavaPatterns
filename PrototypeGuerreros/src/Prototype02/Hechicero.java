package Prototype02;

public class Hechicero extends Enemigo {
	
	public Hechicero() {
		System.out.println("Hechicero creado");
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		System.out.println("El hechicero ataca");
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("El hechicero se detiene");
	}

}
