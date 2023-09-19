package Course44;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		Random rnd = new Random();
		
		//①Playerクラスのインスタンスを生成する
		Player me = new Player();
		//②meの各パラメータに1～5のランダムな数値をセット
		me.setGakuryoku(rnd.nextInt(5)+1);
		me.setKinryoku(rnd.nextInt(5)+1);
		me.setMitame(rnd.nextInt(5)+1);
		me.setOmosiro(rnd.nextInt(5)+1);
		
		//③Targrtクラスのインスタンスを生成する
		Target koku = new Target();
		//④kokuの各パラメータに3～13のランダムな数値をセット
		koku.setHituyouGaku(rnd.nextInt(11)+3);
		koku.setHituyoukin(rnd.nextInt(11)+3);
		koku.setHituyouMita(rnd.nextInt(11)+3);
		koku.setHituyouOmo(rnd.nextInt(11)+3);
		
		//⑤meの現在のパラメータを表示する
		System.out.println("現在のパラメータです");
		System.out.println("学力↓");
		System.out.println(me.getGakuryoku());
		System.out.println("筋力↓");
		System.out.println(me.getKinryoku());
		System.out.println("見た目↓");
		System.out.println(me.getMitame());
		System.out.println("面白さ↓");
		System.out.println(me.getOmosiro());
		
		//⑥トレーニングメニューを表示
		for(int i = 0 ; i < 7 ; i++) {
		
		System.out.println("どのトレーニングをしますか?");
		System.out.println("勉強は1・筋トレは2 ・整形は3・ヒトと喋るは4 を押してね");
		//項目選択a
		int a = stdIn.nextInt();
		if(a==1) {
			int b = me.getGakuryoku() + 1;
			me.setGakuryoku(b);
		}
		if(a==2) {
			int c = me.getKinryoku() + 1;
			me.setKinryoku(c);
		}	
		if(a==3) {
		    int d = me.getMitame() + 1;
			me.setMitame(d);
		}	
		if(a==4){
		    int e = me.getOmosiro() + 1;
			me.setOmosiro(e);
		}
		
		System.out.println("告白ni必要なすてたす");
		int ransu = rnd.nextInt(4) + 1;
		if(ransu==1) {
			System.out.println(koku.getHituyouGaku());
			sy
		}
		if(ransu==2) {
			System.out.println(koku.getHituyoukin());
		}	
		if(ransu==3) {
			System.out.println(koku.getHituyouMita());
		}	
		if(ransu==4){
			System.out.println(koku.getHituyouOmo());
		}
		
		
		
		
		
		System.out.println("自分の学力"+me.getGakuryoku());
		System.out.println("自分の筋トレ"+me.getKinryoku());
		System.out.println("自分の見た目"+me.getMitame());
		System.out.println("自分の笑"+me.getOmosiro());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
		
	


