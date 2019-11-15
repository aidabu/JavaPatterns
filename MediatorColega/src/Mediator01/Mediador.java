package Mediator01;

import java.util.ArrayList;

public class Mediador implements IMediador {

	private ArrayList<Colega> colegas;
	
	public Mediador() {
		this.colegas = new ArrayList<Colega>();
	}
	
	public void agregarColega(Colega colega) {
		this.colegas.add(colega);
	}

	@Override
	public void enviar(String mensaje, Colega emisor) {
		// TODO Auto-generated method stub
		for(Colega colega : colegas) {
			if(colega != emisor) {
				colega.recibir(mensaje);
			}
		}
	}
}
