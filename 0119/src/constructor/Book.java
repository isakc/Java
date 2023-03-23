package constructor;

public class Book {
	public Book(){
		this(true);
		System.out.println("★");
	}
	
	public Book(String name){
		System.out.println("■");
	}
	
	public Book(boolean b){
		this(3);
		System.out.println("●");
	}
	
	public Book(Book b){
		this(false);
		System.out.println("◆");
	}
	
	public Book(int price){
		this("Book");
		System.out.println("▲");
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println("----------------------");
		Book book2 = new Book(book);
	}
}
