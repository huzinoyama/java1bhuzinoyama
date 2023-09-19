package Course12;

public class Sample02 {

	public static void main(String[] args) {
		int x= 0;
		do {
			if (x < 3) {
				System.out.println("ifとの組み合わせだよ");
			} else if (x == 2) {
				break;
				
			}
			x++;
		}while (x < 3);
		

	}

}
