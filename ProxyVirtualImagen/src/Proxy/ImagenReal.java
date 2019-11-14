package Proxy;

public class ImagenReal implements Imagen {
	
	private String nombre;
	
	public ImagenReal(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void mostrarImagen() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando imagen: [" + nombre + "]");
	}

}
