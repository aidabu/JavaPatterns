package Decorator;

public class Ventana implements IVentana {
	
	public Ventana() {
		
	}

	@Override
	public void dibujar(int columna, int fila) {
		// TODO Auto-generated method stub
		System.out.println("Dibujada ventana basica en [" + columna + "], [" + fila + "]");
	}

}
