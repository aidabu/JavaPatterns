package Composite01;

public class Archivo extends Nodo {
	
	public Archivo (String nombre) {
		this.setTipoNodo(Nodo.ARCHIVO);
		this.setNombre(nombre);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Archivo: [" + this.getNombre() + "]");
	}

}
