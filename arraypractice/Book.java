package arraypractice;

public class Book {
	
	private String title;
	 private String author;
	 private double price;

	 // default constructor
	 public Book( )
	 {
	  title = "";
	  author = "";
	  price  = 0.0;
	 }

	 // overloaded constructor
	 public Book( String newTitle, String newAuthor, double newPrice )
	 {
	  title = newTitle;
	  author = newAuthor;
	  price  = newPrice;
	 }

	 // getTitle method
	 public String getTitle( )
	 {
	  return title;
	 }
	 // continued on the next slide
	// Example 9-13 Book class (Cont’d)

	// getAuthor method
	 public String getAuthor( )
	 {
	  return author;
	 }

	 // getPrice method
	 public double getPrice( )
	 {
	  return price;
	 }

	 // toString
	 public String toString( )
	 {
	  return ( "title: " + title + "\t"
	           + "author: " + author + "\t"
	           + "price: " + price );
	 }
	}


