package Prototype01;

public class Guerrero extends Enemigo {
	
	public Guerrero() {
		System.out.println("Guerrero creado");
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		/*
		 * Creamos una nueva instancia y le asignamos los valores actuales para
		 * despues devolverlo (es tambien de tipo Prototype ya que hereda de el)
		 */
		Guerrero objGuerrero = new Guerrero();
		
		objGuerrero.setNombre(this.getNombre());
		objGuerrero.setArma(this.getArma());
		
		return objGuerrero;
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
