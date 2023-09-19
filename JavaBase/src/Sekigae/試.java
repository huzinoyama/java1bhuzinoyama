package Sekigae;

import java.util.ArrayList;
import java.util.Collections;

public class 試 {

		    public static void main(String[] args) {
		        ArrayList<Integer> list = new ArrayList<Integer>();
		 
		        // listに値を入れる。この段階では昇順
		        for(int i = 1 ; i <= 36 ; i++) {
		            list.add(i);
		        }
		        
		        // シャッフルして、順番を変える
		        Collections.shuffle(list);
		        
		        // シャッフルした結果を表示させる
		        System.out.println(list);
		        System.out.println(" ");
		    }


}