package FactoryMethod01;

public class Creador extends CreadorAbstracto {
	
	public void Creador() {
		
	}

	@Override
	public IArchivo crear(int tipo) {
		// TODO Auto-generated method stub
		
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
