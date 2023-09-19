package Course18;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		String[] mygroup = new String[3];
		mygroup[0] = "いとう君";
		mygroup[1] = "すずき君";
		mygroup[2] = "やすだ君";

		//
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 2;
		mygroupnum[1] = 15;
		mygroupnum[2] = 26;


		//
		int[] mynum = new int[3];
		mynum[0] = 10;
		mynum[1] = 50;
		mynum[2] = mynum[0]+mynum[1];
			
		//
		int[] myNumScan = new int[3];
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("数字ぷりーず");
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0]+myNumScan[1];
		System.out.println(myNumScan[2]);

		}

	}

