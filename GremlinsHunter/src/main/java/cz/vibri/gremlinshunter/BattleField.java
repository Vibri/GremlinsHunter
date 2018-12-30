package cz.vibri.gremlinshunter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cz.vibri.gremlinshunter.aliens.Gizmo;
import cz.vibri.gremlinshunter.humans.Human;
import cz.vibri.gremlinshunter.humans.Hunter;
import cz.vibri.gremlinshunter.interfaces.ISignAndPosition;
import cz.vibri.gremlinshunter.items.Food;
import cz.vibri.gremlinshunter.items.Item;
import cz.vibri.gremlinshunter.items.Water;

public class BattleField {

	private int xs;
	private int ys;
	private Gremlins gremlins;
	private Humans humans;
	private List<Item> items;
	private Random random = new Random();

	public BattleField(int xs, int ys) {
		this.xs = xs;
		this.ys = ys;
		this.gremlins = new Gremlins();
		this.humans = new Humans();
		this.items = new ArrayList<>();
		initialize();
	}

	private void initialize() {
		initFood();
		initWater();
		initHuman();
		initGizmo();
		initHunter();
	}

	private void initGizmo() {
		addCreature(new Gizmo(0, 0));
	}

	private void initHunter() {
		addHuman(new Hunter(xs - 1, ys - 1));
	}

	private void initHuman() {
		int firstHuman = random.nextInt(xs * ys - 2) + 1;
		int secoundHuman = random.nextInt(xs * ys - 2) + 1;
		while (firstHuman == secoundHuman) {
			secoundHuman = random.nextInt(xs * ys - 2) + 1;
		}
		Position pos = getPosition(firstHuman);
		addHuman(new Human(pos.getX(), pos.getY()));
		pos = getPosition(secoundHuman);
		addHuman(new Human(pos.getX(), pos.getY()));
	}

	private void initWater() {
		for (int i = 1; i < xs * ys - 2; i++) {
			int prav = random.nextInt(11);
			if (prav <= 2) {
				Position pos = getPosition(i);
				addItem(new Water(pos.getX(), pos.getY()));
			}
		}
	}

	private Position getPosition(int value) {
		Position pos = new Position();
		pos.setX(value % xs);
		pos.setY(value / xs);
		return pos;
	}

	private void initFood() {
		Position position = getPosition(random.nextInt(xs * ys - 2) + 1);
		addItem(new Food(position.getX(), position.getY()));
	}

	public void addCreature(Gizmo creature) {
		gremlins.addCreature(creature);
	}

	public void addHuman(Human human) {
		humans.addHuman(human);
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void vykresli() {
		ISignAndPosition[][] battleField = new ISignAndPosition[xs][ys];
		place(battleField, items);
		place(battleField, gremlins.getCreatures());
		place(battleField, humans.getMankinds());

		System.out.print("   ");
		for (char c = 'A'; c < 'A' + xs; c++) {
			System.out.print(c);
		}
		System.out.println();

		for (int j = 0; j < ys; j++) {
			System.out.print(String.format("% 3d", j + 1));
			for (int i = 0; i < xs; i++) {
				if (battleField[i][j] != null) {
					System.out.print(battleField[i][j].getSign());
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		humans.vypisStav();
		gremlins.vypisStav();
	}

	private void place(ISignAndPosition[][] battleField, List<? extends ISignAndPosition> list) {
		for (ISignAndPosition item : list) {
			ISignAndPosition sign = battleField[item.getX()][item.getY()];
			if (sign == null || (item.getWeight() > sign.getWeight())) {
				battleField[item.getX()][item.getY()] = item;
			}
		}
	}

	private class Position {
		int x;
		int y;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}
}
