package Course18;

public class Sample01 {

	public static void main(String[] args) {
		
		String a =  "やすだ君";
		String b = "さかもと君";
		String c = "いとう(そ)君";
		String d = "いの君";
		String e = "すずき君";
		String f = "いとう(こ)君";
		String g = "かけがわ君";
		
		
		//配列の鉄板構文
		//[]のことを要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] =  "やすだ君";
		nameList[1] = "さかもと君";
		nameList[2] = "いとう(そ)君";
		nameList[3] = "いの君";
		nameList[4] ="すずき君";
		nameList[5] = "いとう(こ)君";
		nameList[6] ="かけがわ君";
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println("俺の友達の名前は" +  nameList[i] + "だ。");
			
		}
	
		
		

	}

}
