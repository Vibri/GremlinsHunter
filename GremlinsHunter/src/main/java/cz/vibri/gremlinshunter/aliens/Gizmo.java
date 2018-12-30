package cz.vibri.gremlinshunter.aliens;

import java.util.Random;

import cz.vibri.gremlinshunter.enums.EStav;
import cz.vibri.gremlinshunter.interfaces.IAkcni;
import cz.vibri.gremlinshunter.interfaces.IInformujici;
import cz.vibri.gremlinshunter.interfaces.ISignAndPosition;

public class Gizmo implements IInformujici, IAkcni, ISignAndPosition {

	private int MAX_ZIVOTU = 1;
	private int x;
	private int y;
	private int pocetZivotu;
	private EStav stav;
	private int uhyb;
	private int pS;
	private int pR;
	private int pL;
	private int pD;
	private int pU;
	protected Random random = new Random();

	public Gizmo(int x, int y) {
		this.x = x;
		this.y = y;
		this.pocetZivotu = MAX_ZIVOTU;
		this.pS = 20;
	}

	@Override
	public char getSign() {
		return 'O';
	}

	@Override
	public int getWeight() {
		return 6;
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

	protected int getMaxZivotu() {
		return MAX_ZIVOTU;
	}

	@Override
	public void vypisStav() {
		if (pocetZivotu() == getMaxZivotu()) {
			System.out.print(EStav.V_PORADKU.toString());
		} else if (pocetZivotu() == 0) {
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

	public int getpS() {
		return pS;
	}

	public void setpS(int pS) {
		this.pS = pS;
	}

	public int getpR() {
		return pR;
	}

	public void setpR(int pR) {
		this.pR = pR;
	}

	public int getpL() {
		return pL;
	}

	public void setpL(int pL) {
		this.pL = pL;
	}

	public int getpD() {
		return pD;
	}

	public void setpD(int pD) {
		this.pD = pD;
	}

	public int getpU() {
		return pU;
	}

	public void setpU(int pU) {
		this.pU = pU;
	}

	public void setStav(EStav stav) {
		this.stav = stav;
	}

}
