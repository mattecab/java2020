
public class Book{
	private String title;
	//change to object Author?
	private Author author;
	private int year;
	private String publisher;
	private  int cost;

	public Book( String title, int year, String publisher, int cost) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", publisher=" + publisher + ", cost=" + cost + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return  author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}

