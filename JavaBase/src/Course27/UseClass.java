package Course27;

public class UseClass {

	public static void main(String[] args) {
		
		Drink no = new Drink(100,"初期データ");
		no.display();
		
		no.price = 150;
		no.name = "午後の紅茶";
		
		no.display();
		

		int sum = no.calcSum(no.price,17);
		System.out.println("合計値は" + sum);
		
		
		
		

	}

}
