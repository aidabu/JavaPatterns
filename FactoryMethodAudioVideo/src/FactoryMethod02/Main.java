package FactoryMethod02;

public class Main {

	public static void main(String[] args) {
				
		IArchivo audio = Creador.getArchivo(Creador.AUDIO);
		audio.reproducir();
		
		IArchivo video = Creador.getArchivo(Creador.VIDEO);
		video.reproducir();

	}

}
