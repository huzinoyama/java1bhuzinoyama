package Course32;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		int x = stdIn.nextInt();
		if(x > 49) {
			int y = stdIn.nextInt();
			calc(x, y);
		} else {
			calc(x);
		}
		
	}
	
	static void calc(int x, int y) {
		System.out.println(x + y);
	}
	
	static void calc(int x) {
		System.out.println(x * 10);
	}
	
}
