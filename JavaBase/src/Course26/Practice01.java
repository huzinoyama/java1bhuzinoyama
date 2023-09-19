package Course26;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Character me = new Character();

		

		System.out.println("プレイヤー1のパラメータを入力してね");

		Scanner stdIn = new Scanner(System.in);

		System.out.println("名前は?");
		me.name = stdIn.next();

		System.out.println("HPは?");
		me.hp = stdIn.nextInt();
		me.str = 100;
		me.dex = 50;
		me.agi = 100;
		me.def = 70;

		me.viewStatus();

		me.name = "ふじひら";
		me.hp = 200;
		me.str = 100;
		me.dex = 150;
		me.agi = 100;
		me.def = 50;

		me.viewStatus();

		Character tonari = new Character();

		tonari.name = "ねもと";
		tonari.hp = 50;
		tonari.str = 150;
		tonari.dex = 100;
		tonari.agi = 150;
		tonari.def = 150;

		tonari.viewStatus();

		me.battle(me, tonari);

	}

}
