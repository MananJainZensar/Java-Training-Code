package HasA;

public class Book {
	private int id;
	private String title;
	private int price;
	private Author Author;
	public Book(int id, String title, int price, HasA.Author author) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		Author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getAuthor() {
		return Author;
	}
	public void setAuthor(Author author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", Author=" + Author + "]";
	}
	
	
}
