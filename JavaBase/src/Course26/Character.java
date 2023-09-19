package Course26;

public class Character {
	String name;
	int hp;
	int str;
	int dex;
	int agi;
	int def;

	void viewStatus() {
		System.out.println(name + "のステータスは");
		System.out.println("HP:" + hp);
		System.out.println("str:" + str);
		System.out.println("dex:" + dex);
		System.out.println("agi:" + agi);
		System.out.println("def:" + def);
	}

	void battle(Character player1, Character player2) {
		System.out.println(player1.name + "と" + player2.name + "の熱い戦いが始まる・・・！");

		//hpが続く限り戦いを続けるための処理
		while (player1.hp > 0 && player2.hp > 0) {

			if (player1.agi >= player2.agi) {
				player2.hp = player2.hp - (player1.str - player2.def);
				player2.agi = player2.agi + 10;
			} else {
				player1.hp = player1.hp - (player2.str - player1.def);
				player1.agi = player2.agi + 10;
			}
			System.out.println(player1.name + "のHP" + player1.hp);
			System.out.println(player2.name + "のHP" + player2.hp);

		}
		System.out.println("は死亡した。だが、皆の記憶の中で生き続ける。");

	}
}


