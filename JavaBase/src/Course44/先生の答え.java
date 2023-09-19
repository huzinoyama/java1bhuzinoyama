package Course44;

import java.util.Random;
import java.util.Scanner;

public class 先生の答え {
	

	
		public static void main(String[] args) {

			//乱数とかScannerの準備
			Random rnd = new Random();
			Scanner stdIn = new Scanner(System.in);

			//①プレイヤーインスタンスを生成
			Player me = new Player();

			//②プレイヤーのパラメータをセット
			me.setKinryoku(rnd.nextInt(5) + 1);
			me.setGakuryoku(rnd.nextInt(5) + 1);
			me.setMitame(rnd.nextInt(5) + 1);
			me.setOmosiro(rnd.nextInt(5) + 1);

			//③ターゲットのインスタンスを生成
			Target koku = new Target();

			//④ターゲットのパラメータをセット
			koku.setHituyouKin(rnd.nextInt(11) + 3);
			koku.setHituyouGaku(rnd.nextInt(11) + 3);
			koku.setHituyouMita(rnd.nextInt(11) + 3);
			koku.setHituyouOmo(rnd.nextInt(11) + 3);

			//for文で⑨を表現する
			for (int count = 0; count < 7; count++) {

				//⑤プレイヤーの現在パラメータを表示。
				System.out.println("筋力" + me.getKinryoku());
				System.out.println("学力" + me.getGakuryoku());
				System.out.println("見た目" + me.getMitame());
				System.out.println("面白" + me.getOmosiro());

				//⑥
				System.out.println("トレーニングメニューを選んでね");
				System.out.println("1:筋トレする、2:勉強する、3:整形する、4:人と話す。");
				int menu = stdIn.nextInt();

				if (menu == 1) {
					System.out.println("筋トレ。筋肉が喜んでいます。");
					me.setKinryoku(me.getKinryoku() + 1);
				} else if (menu == 2) {
					System.out.println("勉強。脳みそが喜んでいます。");
					me.setGakuryoku(me.getGakuryoku() + 1);
				} else if (menu == 3) {
					System.out.println("整形。見た目が喜んでいます。");
					me.setMitame(me.getMitame() + 1);
				} else if (menu == 4) {
					System.out.println("人と喋る。ユーモアが喜んでいます。");
					me.setOmosiro(me.getOmosiro() + 1);
				}

				//⑦
				int checkKokuParam = rnd.nextInt(4);
				if (checkKokuParam == 0) {
					System.out.println("相手の筋肉は" + koku.getHituyouKin());
				} else if (checkKokuParam == 1) {
					System.out.println("相手の学力は" + koku.getHituyouGaku());
				} else if (checkKokuParam == 2) {
					System.out.println("相手の見た目は" + koku.getHituyouMita());
				} else if (checkKokuParam == 3) {
					System.out.println("相手の面白は" + koku.getHituyouOmo());
				}
			}
			//⑨
			System.out.println("告白する！！！！能力選んで！！！");
			int userParam = stdIn.nextInt();
			int winFlag = 0;
			if (userParam == 1 && me.getKinryoku() >= koku.getHituyouKin()) {
				System.out.println("筋肉は勝った。");
				winFlag = winFlag + 1;
			} else if (userParam == 2 && me.getGakuryoku() >= koku.getHituyouGaku()) {
				System.out.println("学力は勝った。");
				winFlag = winFlag + 1;
			} else if (userParam == 3 && me.getMitame() >= koku.getHituyouMita()) {
				System.out.println("見た目は勝った。");
				winFlag = winFlag + 1;
			} else if (userParam == 4 && me.getOmosiro() >= koku.getHituyouOmo()) {
				System.out.println("面白は勝った。");
				winFlag = winFlag + 1;
			}

			//ランダムなパラメータを比較
			int randomParam = rnd.nextInt(4);
			if (randomParam == 0 && me.getKinryoku() >= koku.getHituyouKin()) {
				winFlag = winFlag + 1;
			} else if (randomParam == 1 && me.getGakuryoku() >= koku.getHituyouGaku()) {
				winFlag = winFlag + 1;
			} else if (randomParam == 2 && me.getMitame() >= koku.getHituyouMita()) {
				winFlag = winFlag + 1;
			} else if (randomParam == 3 && me.getOmosiro() >= koku.getHituyouOmo()) {
				winFlag = winFlag + 1;
			}
			if (winFlag > 1) {
				System.out.println("あなたは勝ちました。");
			} else {
				System.out.println("死亡しました。");
			}
		}
	}










}
