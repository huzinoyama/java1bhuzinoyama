package Course42;

public class StudentControll {
	public static void main(String[] args) {
		
		Student tonari = new Student(8,"掛川孝己");
		
		Student me = new Student(24,"藤平陸仁");
		
		Student[] mymen = new Student[2];
		
		mymen[0] = tonari;
		
		mymen[1] = me;
		
		mymen[0].setName("立川");
		
		System.out.println(mymen[0].getName());

	}
}