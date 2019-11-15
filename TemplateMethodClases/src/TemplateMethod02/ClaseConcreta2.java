package TemplateMethod02;

public class ClaseConcreta2 extends ClaseAbstracta {

	public ClaseConcreta2() {

	}

	@Override
	public void mensaje() {
		// Procesamos código extra
		System.out.println("En ClaseConcreta2");
		// Llamamos al código del método implementado en la clase abstracta
		super.mensaje();
	}

	@Override
	public int multiplicar(int num) {
		return num * 1000;
	}

	@Override
	public int sumar(int num) {
		return num + 100;
	}

}
