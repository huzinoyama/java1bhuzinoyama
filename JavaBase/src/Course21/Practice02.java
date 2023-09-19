package Course21;

import java.util.Arrays;

public class Practice02 {

	public static void main(String[] args) {
		
		String[][] arr = new String[3][3];

		arr[0][0] = "o";
		arr[0][1] = "x";
		arr[0][2] = "o";

		arr[1][0] = "x";
		arr[1][1] = "o";
		arr[1][2] = "x";

		arr[2][0] = "o";
		arr[2][1] = "o";
		arr[2][2] = "o";
		
		System.out.println(arr[2][1]);
		
		System.out.println(Arrays.deepToString(arr));
		
		int count = 0;
		for(int i = 0; i < 3; i++);{
		for(int j = 0; j < 3; j++);{
		System.out.print("現在の要素は" + arr[i][j]);
		if (arr[i][j].equals("o")) {
			count = count + 1;
	
			}
		

	
		}
		}
	}
	
}
