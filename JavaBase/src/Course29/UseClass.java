package Course29;

public class UseClass {

	public static void main(String[] args) {
		
		Computer mypc = new Computer("初期ネーム","初期CPU",0,"初期GURABO",100);
		mypc.display();
		
		mypc.name = "KOKURI MACHINE";
		mypc.cpu = "intel core-19 13900H";
		mypc.memory = 16;
		mypc.gurabo = "RTX4070";
		mypc.price = 250000;
		
		int modori = mypc.nebiki(2000);
		System.out.println(modori);

	}

}
