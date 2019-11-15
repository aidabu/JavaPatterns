package Command;

public class MenuItemSalir implements IMenuItem {
	
	Receptor r;
	
	public MenuItemSalir(Receptor r) {
		this.r = r;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		r.accion("SALIR");
	}

}
