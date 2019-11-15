package Visitor03;

import java.util.ArrayList;

public class GrupoFacturas implements IElemento {
	
	ArrayList<Factura> facturas = new ArrayList<Factura>();

	public GrupoFacturas() {
	}

	public void agregarFactura(Factura factura) {
		this.facturas.add(factura);
	}

	public Factura getFactura(int posicion) {
		return this.facturas.get(posicion);
	}

	@Override
	public void accept(IVisitor visitor) {
		for (Factura f : this.facturas) {
			f.accept(visitor);
		}
	}
}