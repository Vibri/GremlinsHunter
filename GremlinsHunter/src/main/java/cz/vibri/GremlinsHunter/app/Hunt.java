package cz.vibri.GremlinsHunter.app;

import cz.vibri.GremlinsHunter.BattleField;

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
