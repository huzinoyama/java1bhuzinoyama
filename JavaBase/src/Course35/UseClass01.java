package Course35;

public class UseClass01 {

	public static void main(String[] args) {
		Student st = new Student();
		st.name = "藤平陸仁";
		st.no = 24;
		
		Student ne = new Student();
		ne.name = "根本晴";
		ne.no = 21;
		
		Student[] myfriend = new Student[2];
		
		myfriend[0] = st;
		myfriend[0] = ne;
		for(int i = 0; i < 2; i++) {
			System.out.println(myfriend[i].name);
		}
	}

}
