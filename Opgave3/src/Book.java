public abstract class Book
{

  private String title;
  private String isbn;

  public Book(String title, String isbn)
  {
    this.title = title;
    this.isbn = isbn;
  }


  public String toString(){

    return "Book title: " + title + " isbn: " + isbn;
  }

  public boolean equals(Object obj){

    if (!(obj instanceof Book)){
      return false;
    }

    Book other = (Book) obj;

    return other.isbn.equals(isbn) && other.title.equals(title);

  }


  public abstract String getBookType();
  public String getTitle()
  {
    return title;
  }

  public String getIsbn()
  {
    return isbn;
  }
}
