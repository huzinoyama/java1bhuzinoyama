package Course10;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加算します");

		System.out.println("xの値を入力してください");
		double x= stdIn.nextDouble();
		
		System.out.println("yの値を入力してください");

		double y = stdIn.nextDouble();
		
		System.out.println("x + y +100 =" + (x + y +100 ));



	}

}
