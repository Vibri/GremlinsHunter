package cz.vibri.GremlinsHunter.items;

public class Water extends Item {

	public Water(int x, int y) {
		super(x, y);
	}

	@Override
	public char getSign() {
		return '~';
	}

	@Override
	public int getWeight() {
		return 1;
	}
}
