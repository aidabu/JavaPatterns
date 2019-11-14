package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		
		//Se insertan los componentes con el borde azul
		Cliente cliente = new Cliente(new ComponentesAzules());
		
		System.out.println("-----------------------------");
		
		//Ahora se insertaran los componentes con el borde rojo
		cliente = new Cliente(new ComponentesRojos());

	}

}
