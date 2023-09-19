package Course21;

import java.util.Scanner;

public class paz {

	public static void main(String[] args) {
		String[][] arr = new String[3][3];
		arr[0][0] = "☆";
		arr[0][1] = "□";
		arr[0][2] = "☆";
		arr[1][0] = "□";
		arr[1][1] = "☆";
		arr[1][2] = "△";
		arr[2][0] = "△";
		arr[2][1] = "□";
		arr[2][2] = "△";

		
	
		
		
		
		System.out.println("現在のパネル");
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {

				System.out.print(arr[a][b]);

			}
			System.out.println();
		}

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("入れ替え位置を入力");
		int d = stdIn.nextInt();
		int c = d;
		
		System.out.println("入れ替え位置を入力");
		int dd = stdIn.nextInt();
		int cc = dd;
		
		System.out.println("入れ替え位置を入力");
		int f = stdIn.nextInt(); 
		int ccc = f;
		
		System.out.println("入れ替え位置を入力");
		int ff = stdIn.nextInt();
		int	cccc = ff;
		
		arr[f][ff]=arr[c][cc] ;
		arr[ccc][cccc]=arr[f][ff] ; 
		
		
		System.out.println("現在のパネル");
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {

				System.out.print(arr[a][b]);

			}
			System.out.println();
		}
		
		
		
		
		
	
	}

}
