package Composite02;

public class Archivo extends Nodo {
	
	public Archivo (String nombre, Nodo nodoPadre) {
		this.setTipoNodo(Nodo.ARCHIVO);
		this.setNombre(nombre);
		
		this.setNodoPadre(nodoPadre);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando el contenido del archivo [" + this.getNombre() + "]");
	}

}
