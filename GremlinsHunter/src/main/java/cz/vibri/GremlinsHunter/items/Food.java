package cz.vibri.GremlinsHunter.items;

public class Food extends Item {

	public Food(int x, int y) {
		super(x, y);
	}

	@Override
	public char getSign() {
		return '!';
	}

	@Override
	public int getWeight() {
		return 2;
	}

}
