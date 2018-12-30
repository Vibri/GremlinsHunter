package cz.vibri.gremlinshunter.humans;

import java.util.Random;

import cz.vibri.gremlinshunter.enums.EStav;
import cz.vibri.gremlinshunter.interfaces.IAkcni;
import cz.vibri.gremlinshunter.interfaces.IInformujici;
import cz.vibri.gremlinshunter.interfaces.ISignAndPosition;

public class Human implements IInformujici, IAkcni, ISignAndPosition {

	private static final int MAX_ZIVOTU = 1;
	protected int x;
	protected int y;
	protected int pocetZivotu;
	protected EStav stav;
	protected int uhyb;
	protected int pS;
	protected int pR;
	protected int pL;
	protected int pD;
	protected int pU;
	protected Random random = new Random();

	public Human(int x, int y) {
		this.x = x;
		this.y = y;
		this.pocetZivotu = MAX_ZIVOTU;
	}

	@Override
	public char getSign() {
		return 'M';
	}

	@Override
	public int getWeight() {
		return 5;
	}

	public int getUhyb() {
		return uhyb;
	}

	public void setUhyb(int uhyb) {
		this.uhyb = uhyb;
	}

	public EStav getStav() {
		return stav;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public void setY(int y) {
		this.y = y;
	}

	public int getPocetZivotu() {
		return pocetZivotu;
	}

	public void setPocetZivotu(int pocetZivotu) {
		this.pocetZivotu = pocetZivotu;
	}

	protected int getMaxZivotu() {
		return MAX_ZIVOTU;
	}

	@Override
	public void pohyb() {
		// TODO Auto-generated method stub

	}

	@Override
	public int utok(int x, int y) {
		if (this.x != x || this.y != y) {
			return 0;
		}

		int possibility = random.nextInt(100);
		if (possibility < uhyb) {
			return 0;
		} else {
			pocetZivotu--;
			return 1;
		}
	}

	@Override
	public void vypisStav() {
		if (getPocetZivotu() == getMaxZivotu()) {
			System.out.print(EStav.V_PORADKU.toString());
		} else if (getPocetZivotu() == 0) {
			System.out.print(EStav.ZNICEN.toString());
		} else {
			System.out.print(EStav.ZRANEN);
		}
		System.out.println(" pocet zivotu: " + getPocetZivotu());
	}

	@Override
	public int pocetZivotu() {
		return getPocetZivotu();
	}

}
