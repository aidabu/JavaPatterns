package Visitor03;

public class Mostrar implements IVisitor {

	public Mostrar() {
	}

	@Override
	public void visit(Factura fact) {
		System.out.println("=========================");
		System.out.println("Factura número [" + fact.getCodigo() + "]");
	}

	@Override
	public void visit(Articulo art) {
		System.out.println("Artículo [" + art.getNombre() + "] --> [" + art.getUnidades() + "] unidades)");
	}

}
