package Course44;

import java.util.Random;
import java.util.Scanner;

public class kazu {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		int ransu = rnd.nextInt(100) + 1;
		int i = 0;

		while (true) {
			System.out.println("数を入れてください");
			int a = stdIn.nextInt();

			if (ransu == a) {
				System.out.println(i + "回目でクリア！答えは" + ransu + "です");
				break;

			} else {
				if (ransu > a) {
					System.out.println("答えはもっと大きい数字です");
				} else {
					System.out.println("答えはもっと小さい数字です");
				}
				i = i + 1;
			}
		}
	}
}