package cz.vibri.gremlinshunter.aliens;

public class TurboGremlin extends Gizmo {

	private static final int MAX_ZIVOTU = 2;

	public TurboGremlin(int x, int y) {
		super(x, y);
		setpS(0);
		setPocetZivotu(MAX_ZIVOTU);
		setUhyb(40);
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
