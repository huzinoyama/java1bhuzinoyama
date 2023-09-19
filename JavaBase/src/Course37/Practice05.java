package Course37;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();

		if (num > 90) {
			System.out.println("50以上です");
		}else if (num >= 80 ) {
			System.out.println("49以下です");
	}
	}

}
