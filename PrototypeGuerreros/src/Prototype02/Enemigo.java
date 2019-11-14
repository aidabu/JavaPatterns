package Prototype02;

public abstract class Enemigo implements Cloneable {

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

	public Enemigo clonar() throws CloneNotSupportedException {
		//Es necesario hacer el typecast porque clone() devuelve Object
		return (Enemigo) this.clone();
	}
	
	//Metodos que deberian ser construidos por las clases que heredan de esta
	public abstract void atacar();
	public abstract void detener();
}
