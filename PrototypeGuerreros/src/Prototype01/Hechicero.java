package Prototype01;

public class Hechicero extends Enemigo {
	
	public Hechicero() {
		System.out.println("Hechicero creado");
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		/*
		 * Creamo una nueva instancia y le asignamos los valores actuales para
		 * despues devolverlo (es tambien de tipo Prototype ya que hereda de el)
		 */
		Hechicero objHechicero = new Hechicero();
		
		objHechicero.setNombre(this.getNombre());
		objHechicero.setArma(this.getArma());
		
		return objHechicero;
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
