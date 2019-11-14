package Prototype01;

public abstract class Enemigo {

	private String nombre = "";
	private String arma = "DAGA";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}

	//Metodos que deberian ser construidos por las clases que heredan de esta
	public abstract Enemigo clonar();
	public abstract void atacar();
	public abstract void detener();
}
