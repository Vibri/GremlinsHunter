package cz.vibri.gremlinshunter;

import java.util.ArrayList;
import java.util.List;

import cz.vibri.gremlinshunter.humans.Human;
import cz.vibri.gremlinshunter.interfaces.IAkcni;
import cz.vibri.gremlinshunter.interfaces.IInformujici;

public class Humans implements IInformujici, IAkcni {

	private List<Human> mankinds = new ArrayList<>();

	public void addHuman(Human human) {
		mankinds.add(human);
	}

	public List<Human> getMankinds() {
		return mankinds;
	}

	@Override
	public void pohyb() {
		// TODO Auto-generated method stub

	}

	@Override
	public int utok(int x, int y) {
		int zivoty = 0;
		for (Human hum : mankinds) {
			zivoty += hum.utok(x, y);
		}
		return zivoty;
	}

	@Override
	public void vypisStav() {
		System.out.println("HUMANS:");
		for (Human hum : mankinds) {
			hum.vypisStav();
		}

	}

	@Override
	public int pocetZivotu() {
		int pocetZivotu = 0;
		for (Human hum : mankinds) {
			pocetZivotu += hum.pocetZivotu();
		}
		return pocetZivotu;
	}

}
