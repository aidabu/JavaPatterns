package Visitor02;

import java.util.List;

public class EquiparConjuro implements IVisitor {

	@Override
	public void visit(Mago m) {
		// TODO Auto-generated method stub
		if (m.getNivelMagia() <= 5) {
			m.setConjuro("Bola de Fuego");
		} else {
			m.setConjuro("Rayo de hielo");
		}
	}

	@Override
	public void visit(Guerrero g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(List<IPersonaje> personajes) {
		// TODO Auto-generated method stub
		for (IPersonaje p : personajes) {
			p.accept(this);
		}
	}

}
