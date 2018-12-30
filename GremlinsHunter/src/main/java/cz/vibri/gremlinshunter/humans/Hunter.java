package cz.vibri.gremlinshunter.humans;

public class Hunter extends Human {

	protected int MAX_ZIVOTU = 6;

	public Hunter(int x, int y) {
		super(x, y);
		this.uhyb = 20;
		this.pocetZivotu = MAX_ZIVOTU;
	}

	@Override
	public char getSign() {
		return 'H';
	}

	@Override
	public int getWeight() {
		return 7;
	}

	@Override
	public void pohyb() {
		// TODO Auto-generated method stub
		super.pohyb();
	}

	@Override
	protected int getMaxZivotu() {
		return MAX_ZIVOTU;
	}

}
