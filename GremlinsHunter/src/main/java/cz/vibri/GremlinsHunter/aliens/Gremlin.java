package cz.vibri.GremlinsHunter.aliens;

public class Gremlin extends Gizmo {

	public Gremlin(int x, int y) {
		super(x, y);
		this.pS = 8;
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
