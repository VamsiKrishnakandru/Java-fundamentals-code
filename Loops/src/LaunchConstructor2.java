class Books
{
	private String authorName;
	private String bookName;
	private double cost;
	Books(String authorName,String bookName,double cost)
	{
		this("Tron");
		System.out.println("Param constructor");
		this.authorName = authorName;
		this.bookName = bookName;
		this.cost = cost;
	}
	Books(String authorName)
	{
		this();
		System.out.println("1 param constructor");
		this.authorName = authorName;
	}
	Books()
	{
		System.out.println("zero Param");
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public double getCost() {
		return cost;
	}
	
	
}


public class LaunchConstructor2 {

	public static void main(String[] args) 
	{
		Books book1 = new Books("Vamsi", "Tron Legacy", 500);
		System.out.println(book1.getAuthorName());
		System.out.println(book1.getBookName());
		System.out.println(book1.getCost());
	}

}
