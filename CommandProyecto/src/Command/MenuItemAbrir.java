package Command;

public class MenuItemAbrir implements IMenuItem {

	Receptor r;
	
	public MenuItemAbrir(Receptor r) {
		this.r = r;
	}
	
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		r.accion("ABRIR");
	}

}
