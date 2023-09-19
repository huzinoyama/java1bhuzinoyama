package Course27;

public class Drink {

	String name;
	int price;
	
	//コンストラクタ追加
	//コンストラクタはメインクラスでnewした時に自動的に発動する。
	Drink(int p, String n){
		price = p;
		name = n;
	}

	void display() {
		System.out.println("値段は:" + price);
		System.out.println("商品名:" + name);

	}

	int calcSum(int x, int y) {
		int sum = x * y;
		return sum;
	}

}
