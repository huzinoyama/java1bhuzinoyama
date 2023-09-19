package Course41;

public class BookControll {
	public static void main(String[] args) {

		Book book1 = new Book();

		Book book2 = new Book("ITワールド");
		
		Book book3 = new Book("いのは〇〇",1000);
		
		System.out.println((book3.getPrice()));
		
		System.out.println(book3.getTitle());
	}
}