package Course35;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		String[]arr2 = new String[3];
		arr2[0] = "あ";
		arr2[1] = "か";
		arr2[2] = "さ";
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(i + "の中身は" + arr2[i] + "です。");
		}
		Pocketon poke1 = new Pocketon();
		poke1.name = "銭亀";
		poke1.power = 100;
		poke1.difficult = 1;

		Pocketon[]myPockes = new Pocketon[3];
		myPockes[0] = poke1;
		
		Pocketon poke2 = new Pocketon();
		
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;
		
		myPockes[1] = poke2;
		
		System.out.println(myPockes[0].name);
		
		System.out.println(myPockes[1].difficult);
		
		Pocketon poke3 = new Pocketon();
		Scanner stdIn = new Scanner(System.in);
		poke3.name=stdIn.next();
		poke3.power= stdIn.nextInt();
		poke3.difficult= stdIn.nextInt();
		
		myPockes[2] = poke3;
		
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);
		
		for(int i = 0;i < 3; i++) {
			System.out.println(myPockes[i].name);
		}
		myPockes[1].display();
	}

		

}

