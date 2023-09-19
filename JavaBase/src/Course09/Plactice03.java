package Course09;

import java.util.Scanner;

public class Plactice03 {

	public static void main(String[] args) {
		
		System.out.println("誕生月を入力してね。");
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();
		switch(month) {
		case 1:
			System.out.println("死凶");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("大凶");
			break;
		case 9:
		case 10:
		System.out.println("中吉");
		break;
		case 11:
			System.out.println("大吉");
		break;
		case 12:
			System.out.println("轟吉");
		break;
		default:
			System.out.println("消えろ");
		
		
			
		}
		

	}

}
