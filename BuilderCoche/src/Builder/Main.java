package Builder;

public class Main {

	public static void main(String[] args) {
		
		//Crear el objeto Director
		Director objFabrica = new Director();
		
		//Crear los objetos ConcreteBuilder
		BuilderCoche base = new ConstructorCocheBase();
		BuilderCoche medio = new ConstructorCocheMedio();
		BuilderCoche full = new ConstructorCocheFull();
		
		//Contruir un coche con equipamiento base
		objFabrica.construir(base);
		Coche cocheBase = base.getCoche();
		
		//Contruir un coche con equipamiento base
		objFabrica.construir(medio);
		Coche cocheMedio = medio.getCoche();
				
		//Contruir un coche con equipamiento base
		objFabrica.construir(full);
		Coche cocheFull = full.getCoche();
		
		//Mostrar la informacion de cada coche creado
		mostrarCaracteristicas(cocheBase);
		mostrarCaracteristicas(cocheMedio);
		mostrarCaracteristicas(cocheFull);
		
	}
		public static void mostrarCaracteristicas(Coche coche) {
			System.out.println("Motor: " + coche.getMotor());
			System.out.println("Carroceria: " + coche.getCarroceria());
			System.out.println("Elevalunas electrico: " + coche.getElevalunasElec());
			System.out.println("Aire acondicionado: " + coche.getAireAcond());
			System.out.println("===================================");
		}

}
