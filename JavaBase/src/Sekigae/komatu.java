package Sekigae;


import java.util.Random;

public class komatu {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		//↓このsekiは席のマス目を担当している
		int[][] seki = new int[6][6];
		
		//↓6つのfor文はそれぞれ列の乱数を発生させるための文
		//1列目の乱数担当
		for (int i = 0; i < 6; i++) {
			seki[0][i] = rnd.nextInt(36) + 1;
		}
		//2列目乱数担当
		for (int i = 0; i < 6; i++) {
			seki[1][i] = rnd.nextInt(36) + 1;
		}
		//3列目乱数担当
		for (int i = 0; i < 6; i++) {
			seki[2][i] = rnd.nextInt(36) + 1;
		}
		//4列目乱数担当
		for (int i = 0; i < 6; i++) {
			seki[3][i] = rnd.nextInt(36) + 1;
		}
		//5列目乱数担当
		for (int i = 0; i < 6; i++) {
			seki[4][i] = rnd.nextInt(36) + 1;
		}
		//6列目乱数担当
		for (int i = 0; i < 6; i++) {
			seki[5][i] = rnd.nextInt(36) + 1;
		}
		
		System.out.println("現在の席↓");
		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j < 6; j++) {
				System.out.print(seki[i][j]);
				
				//↓Sysoutの間を開けるのは番号を見やすくするため
				System.out.print(" ");
			}
			//↓6列に分けるためのSysout
			System.out.println();
		}

	}

}
