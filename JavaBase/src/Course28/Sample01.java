package Course28;

public class Sample01 {

	public static void main(String[] args) {
		Books[] arr = new Books[3];
		
		Books book1 = new Books("ITワールド",100,"サーティファイ");
		arr[0] = book1;
		
		Books book2 = new Books("明解java",400,"柴田望洋");
		arr[1] = book2;
		
		//配列にしまったインスタンスを呼び出すときは
		//以下のように書く。
		System.out.println(arr[1].name);

	}

}
