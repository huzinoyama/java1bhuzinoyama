package Course32;

public class Sample01 {

	public static void main(String[] args) {

		//2つのメソッドを呼び出し
		calc();

		calc(50, 100);

	}

	static void calc() {
		System.out.println("計算をしたいときは、引数を2つ渡して");
	}

	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));
	}
    static void calc(String x) {
	System.out.println("渡された文字は" + x);

    }
    
    static void calc(int y) {
    	System.out.println("受け取った値は" + (y));
    }
}
