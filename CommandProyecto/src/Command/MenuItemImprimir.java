package Command;

public class MenuItemImprimir implements IMenuItem {
	
	Receptor r;
	
	public MenuItemImprimir(Receptor r) {
		this.r = r;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		r.accion("IMPRIMIR");
	}

}
