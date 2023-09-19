package Course08;


public class Sample05 {

	public static void main(String[] args) {
		
String like = "vガンダム";
		
		
		//switch鉄板構文
		switch(like) {
		case "vガンダム":
			System.out.println("vガンダムが好きです。");
			//以降の判定を全スキップ
			break;
		case "サザビー":
			System.out.println("サザビーが好きです。");
			break;
			//どれにも該当しない場合
			default:
				System.out.println("野菜派です");
			
		}

	}

	{


	}

}
