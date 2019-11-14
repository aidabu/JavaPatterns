package Flyweight;

public class Linea implements ILineaLigera {

	private String color;

	public Linea(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public void dibujar(int col, int fila) {
		// TODO Auto-generated method stub
		System.out.println("Dibujando linea de color [" + this.color + "] en [" + col + ", " + fila + "]");
	}

}
