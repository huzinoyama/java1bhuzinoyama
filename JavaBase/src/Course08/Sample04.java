package Course08;

public class Sample04 {

	public static void main(String[] args) {
		
		String like = "魚";
		
		
		//switch鉄板構文
		switch(like) {
		case "魚":
			System.out.println("が好きです。");
			//以降の判定を全スキップ
			break;
		case "肉":
			System.out.println("肉が好きです。");
			break;
			//どれにも該当しない場合
			default:
				System.out.println("野菜派です");
			
		}

	}

}
