package cz.vibri.gremlinshunter.aliens;

public class Gremlin extends Gizmo {

	public Gremlin(int x, int y) {
		super(x, y);
		setpS(8);
	}

	@Override
	public char getSign() {
		return 'X';
	}

	@Override
	public int getWeight() {
		return 3;
	}

}
