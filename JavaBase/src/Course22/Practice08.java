package Course22;

public class Practice08 {

	public static void main(String[] args) {
		int tensu = 100;
		
		//因数を複数渡すときはカンマ(,)区切りで渡す。
		calledmethod(tensu);
		
		

	}
	static void calledmethod(int tensu) {
		
		//受け取った値を画面に表示
		System.out.println("引数で受け取った値は" + tensu + "です。");
	}

}
