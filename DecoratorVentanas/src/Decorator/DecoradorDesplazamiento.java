package Decorator;

public class DecoradorDesplazamiento implements IVentana {

	protected IVentana v;
	
	public DecoradorDesplazamiento(IVentana v) {
		this.setVentana(v);
	}
	
	public IVentana getVentana() {
		return this.v;
	}
	
	public void setVentana(IVentana v) {
		this.v = v;
	}
	
	@Override
	public void dibujar(int columna, int fila) {
		// TODO Auto-generated method stub
		this.getVentana().dibujar(columna, fila);
	}

}
