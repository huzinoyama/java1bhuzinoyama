package Course20;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {
		int[] typhoon = new int[13];
		typhoon[1] = 1;
		typhoon[2] = 1;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 0;
		typhoon[6] = 1;
		typhoon[7] = 4;
		typhoon[8] = 5;
		typhoon[9] = 6;
		typhoon[10] = 4;
		typhoon[11] = 6;
		typhoon[12] = 1;

		int[] quake = new int[13];
		quake[1] = 153;
		quake[2] = 127;
		quake[3] = 130;
		quake[4] = 109;
		quake[5] = 118;
		quake[6] = 164;
		quake[7] = 130;
		quake[8] = 103;
		quake[9] = 103;
		quake[10] = 104;
		quake[11] = 123;
		quake[12] = 141;

		int[] rain = new int[13];
		rain[1] = 20;
		rain[2] = 58;
		rain[3] = 107;
		rain[4] = 87;
		rain[5] = 114;
		rain[6] = 187;
		rain[7] = 200;
		rain[8] = 59;
		rain[9] = 169;
		rain[10] = 441;
		rain[11] = 158;
		rain[12] = 94;

		System.out.println("見たい情報を選んでください");
		System.out.println("1:台風件数 2:地震件数 3:降水量");
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();

		System.out.println("年別か月別かを選んでください。");
		System.out.println("1:年別 2:月別");
		int b = stdIn.nextInt();

		if (a == 1) {
			if (b == 1) {
				//台風の年別合計
				int sum = 0;
				for (int i = 0; i < 12; i++) {
					sum = sum + typhoon[i];
				}
			} else if (b == 2) {
				//月別台風
				System.out.println("見たい月を入力してください");
				int c = stdIn.nextInt();
				System.out.println(c + "月の台風件数は" + typhoon[c - 1] + "件です");
			}


		for (int i = 1; i < typhoon.length; i++) {
			System.out.println(i + "月の台風は" + typhoon[i] + "件です");
		}

	}
	}

}
