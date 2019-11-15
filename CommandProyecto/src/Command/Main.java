package Command;

public class Main {

	public static void main(String[] args) {
		
		//Crear el objeto Menu (el Invocador)
		Menu objMenu = new Menu();
		
		//Crear el Receptor
		Receptor objReceptor = new Receptor();
		
		//Crear las opciones de menu, indicandoles el Receptor
		IMenuItem objOpcionAbrir = new MenuItemAbrir(objReceptor);
		IMenuItem objOpcionImprimir = new MenuItemImprimir(objReceptor);
		IMenuItem objOpcionSalir = new MenuItemSalir(objReceptor);
		
		//Agregar las opciones al Menu
		objMenu.add(objOpcionAbrir);
		objMenu.add(objOpcionImprimir);
		objMenu.add(objOpcionSalir);
		
		//Ejecutar cada opcion del Menu
		objMenu.get(0).ejecutar();
		objMenu.get(1).ejecutar();
		objMenu.get(2).ejecutar();

	}

}
