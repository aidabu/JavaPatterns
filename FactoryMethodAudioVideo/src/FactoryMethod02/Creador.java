package FactoryMethod02;

public class Creador {
	
	public static final int AUDIO = 1;
	public static final int VIDEO = 2;
	
	public void Creador() {
		
	}

	public static IArchivo getArchivo(int tipo) {		
		IArchivo objeto;
		
		switch(tipo) {
			case AUDIO:
				objeto = new ArchivoAudio();
				break;
			case VIDEO:
				objeto = new ArchivoVideo();
				break;
			default:
				objeto = null;
		}
		
		return objeto;
	}

}
