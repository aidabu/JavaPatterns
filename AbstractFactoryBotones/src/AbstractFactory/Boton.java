package AbstractFactory;

public abstract class Boton {

	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void dibujar() {
		System.out.println("Dibujando el boton....");
	}
	
	//Metodo a implementar por las clases que heredan
	public abstract void configurar();
}
