package cz.vibri.gremlinshunter.app;

import cz.vibri.gremlinshunter.BattleField;

public class Hunt {

	public static void main(String[] args) {
		Hunt hunt = new Hunt();

		BattleField battleField = new BattleField(15, 10);

		hunt.vykresli(battleField);
	}

	public void vykresli(BattleField battlefield) {
		battlefield.vykresli();
	}
}
