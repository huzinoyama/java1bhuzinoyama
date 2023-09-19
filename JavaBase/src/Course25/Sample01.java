package Course25;

public class Sample01 {

	public static void main(String[] args) {
		
		//インスタンス
		
		//「hu1」はHumanのインスタンス(実態)
		
		//インスタンスに対してパラメータを設定する。
		
		Human hu1 = new Human();
		hu1.name  = "坂本";
		hu1.kotoba = "ラブ&ピース";
		
		hu1.hp = 50;
		hu1.neru();
		
		System.out.println(hu1.name);
		
		//Chrクラスのインスタンス「numata」を生成。
		//attack def spd love mp hpに好きなパラメータを設定してみよう。
		Chr numata = new Chr();
		numata.attack =500;
		numata.def =0;
		numata.spd =0;
		numata.love =0;
		numata.mp =0;
		numata.hp =0;
		
		//Chrクラスのインスタンス「kajima」を生成
		//パラメータを設定してみよう。
		Chr kajima = new Chr();
		kajima.attack = 100;
		kajima.def = 100;
		kajima.spd = 250;
		kajima.love = 10;
		kajima.hp = 10;
		kajima.mp = 30;
		
		kajima.naguru(kajima.attack.numata.def);
		
		
	}

}
