package cz.vibri.GremlinsHunter;

import java.util.ArrayList;
import java.util.List;

import cz.vibri.GremlinsHunter.aliens.Gizmo;
import cz.vibri.GremlinsHunter.interfaces.IAkcni;
import cz.vibri.GremlinsHunter.interfaces.IInformujici;

public class Gremlins implements IInformujici, IAkcni {

	private List<Gizmo> creatures = new ArrayList<>();

	public List<Gizmo> getCreatures() {
		return creatures;
	}

	public void addCreature(Gizmo creature) {
		this.creatures.add(creature);
	}

	@Override
	public void pohyb() {
		// TODO Auto-generated method stub

	}

	@Override
	public int utok(int x, int y) {
		int zivoty = 0;
		for (Gizmo creature : creatures) {
			zivoty += creature.utok(x, y);
		}
		return zivoty;
	}

	@Override
	public void vypisStav() {
		System.out.println("GREMLINS:");
		for (Gizmo creature : creatures) {
			creature.vypisStav();
		}
	}

	@Override
	public int pocetZivotu() {
		int pocetZivotu = 0;
		for (Gizmo gizmo : creatures) {
			pocetZivotu += gizmo.getPocetZivotu();
		}
		return pocetZivotu;
	}

}
