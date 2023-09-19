package Course36;

public class Practice09 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			sum = sum + i;

		}
		System.out.println(sum);

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int e : numbers) {
			System.out.println(e);
		}

		String[] cities = { "東京", "大阪", "千葉", "神奈川", "埼玉笑" };
		for (String f : cities) {
			System.out.println(f);
		}

		int numsum = 0;
		for (int g : numbers) {
			numsum += g;
		}
		System.out.println(numsum);

		int max = 0;
		for (int h : numbers) {
			if (max <= h) {
				max = h;
			}
		}
		System.out.println(max);

		int[] numbers1 = { 11, 20, 31, 40, 51 };
		for (int i : numbers1) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		printHello();

		multiply(10, 20);

		int modori1 = multiplymodori(20, 30);
		System.out.println(modori1);

		boolean modori2 = isEven(26);
		System.out.println(modori2);

		String name = getGreeting("藤平陸仁");
		System.out.println(name);
	}

	static void printHello() {
		System.out.println("Hello,Wold!");
	}

	static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	static int multiplymodori(int a, int b) {
		return a * b;
	}

	static boolean isEven(int number) {
		boolean tf;
		if (number % 2 == 0) {
			tf = true;
		} else {
			tf = false;
		}
		return tf;
	}

	static String getGreeting(String nume) {
		nume = "こんにちは、" + nume;
		return nume;
	}

}
