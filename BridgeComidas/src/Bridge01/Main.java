package Bridge01;

public class Main {

	public static void main(String[] args) {
		
		//Crear un objeto de tipo 'AbstraccionRefinada' indicandole un 'ImplementadorConcreto'
		ElaborarAlimento lasagna = new ElaborarLasagna(new Carne());
		lasagna.obtener();
		
		//Ahora le indicamos que usa otra implementacion para obtener la de verduras
		lasagna.setImplementador(new Verduras());
		lasagna.obtener();
	}

}
