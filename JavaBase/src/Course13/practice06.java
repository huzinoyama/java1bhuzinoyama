package Course13;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		
		System.out.println("数値を入力してね・。");
		Scanner stdin = new Scanner(System.in);
		
		//変数yyに入力された数値が入力されている。
		int yy = stdin.nextInt();
		
		for(int i = 0; i < yy ; i++) {
			System.out.println("現在"+ i + "回目のループです。");
		}
		

	}

}
