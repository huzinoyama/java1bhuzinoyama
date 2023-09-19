package Course42;

import java.util.Scanner;

public class TyphoonControll {
	public static void main(String[] args) {

		Typhoon[] typhoonList = new Typhoon[9];

		Typhoon typhoon1 = new Typhoon(1, "2022年4月8日", "マラカス");

		Typhoon typhoon2 = new Typhoon(2, "2022年4月10日", "メーギー");

		Typhoon typhoon3 = new Typhoon(3, "2022年6月30日", "チャバ");

		Typhoon typhoon4 = new Typhoon(4, "2022年7月1日", "アイレー");

		Typhoon typhoon5 = new Typhoon(5, "2022年7月28日", "ソングダー");

		Typhoon typhoon6 = new Typhoon(6, "2022年7月31日", "トローセス");

		Typhoon typhoon7 = new Typhoon(7, "2022年8月9日", "ムーラン");

		Typhoon typhoon8 = new Typhoon(8, "2022年8月12日", "メアリー");

		Typhoon typhoon9 = new Typhoon(9, "2022年8月22日", "マーゴン");

		typhoonList[0] = typhoon1;

		typhoonList[1] = typhoon2;

		typhoonList[2] = typhoon3;

		typhoonList[3] = typhoon4;

		typhoonList[4] = typhoon5;

		typhoonList[5] = typhoon6;

		typhoonList[6] = typhoon7;

		typhoonList[7] = typhoon8;

		typhoonList[8] = typhoon9;

		for (int i = 0; i < typhoonList.length; i++) {
			System.out.println(typhoonList[i].getAsiaName());
			
			
			System.out.println("どのモードですか？0　→　名前表示、99　→　編集モード");
			Scanner stdIn = new Scanner(System.in);
			int mode = stdIn.nextInt();

			if (mode != 0) {
				//0じゃなければ編集モード
				System.out.println("更新する台風の台風番号を入力してね。");
				int tyBango = stdIn.nextInt();

				System.out.println("新しい名前を入力してね。。");
				String newName = stdIn.next();

				typhoonList[tyBango - 1].setAsiaName(newName);

			}
			
		}

	}
}