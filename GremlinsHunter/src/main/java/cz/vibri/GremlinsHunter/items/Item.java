package cz.vibri.GremlinsHunter.items;

import cz.vibri.GremlinsHunter.interfaces.ISignAndPosition;

public abstract class Item implements ISignAndPosition {

	protected int x;
	protected int y;

	public Item(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public abstract char getSign();

	@Override
	public abstract int getWeight();

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

}
