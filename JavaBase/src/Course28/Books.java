package Course28;

public class Books {

	String name;
	int page;
	String author;
	
	Books(String t, int i,String s){
		name = s;
		page = i;
		author = t;
		
	}
	
	void display() {
		System.out.println(name);
		System.out.println(page);
		System.out.println(author);
	}
}
