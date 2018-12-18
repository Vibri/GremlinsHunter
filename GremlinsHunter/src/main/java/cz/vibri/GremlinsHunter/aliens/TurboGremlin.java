package cz.vibri.GremlinsHunter.aliens;

public class TurboGremlin extends Gizmo {

	protected int MAX_ZIVOTU = 2;

	public TurboGremlin(int x, int y) {
		super(x, y);
		this.pS = 0;
		this.pocetZivotu = MAX_ZIVOTU;
		this.uhyb = 40;
	}

	@Override
	protected int getMaxZivotu() {
		return MAX_ZIVOTU;
	}

	@Override
	public char getSign() {
		return 'Y';
	}

	@Override
	public int getWeight() {
		return 4;
	}

}
