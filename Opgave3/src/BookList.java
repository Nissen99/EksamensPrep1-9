import java.util.ArrayList;

public class BookList
{
  private ArrayList<Book> books;


  public BookList(){
    books = new ArrayList<>();
  }

  public int getNumberOfBooks(){
    return books.size();
  }

  public void addBook(Book book){
    books.add(book);
  }

  public Book getBook(int index){
    return books.get(index);
  }

  public Book getBook(String isbn){

    for (int i = 0; i < books.size(); i++)
    {
    if (books.get(i).getIsbn().equals(isbn)){
      return books.get(i);
    }

    }
    return null;
  }

  public void removeBook(int index){
    books.remove(index);
  }

  public int getIndexOfFirstPrintedBook(){
    for (int i = 0; i < books.size(); i++)
    {
      if (books.get(i) instanceof PrintedBook){
        return i;
      }
    }
    return -1;
  }

public int getNumberOfBooksByBookType(String bookType){
int counter = 0;
  for (int i = 0; i < books.size(); i++)
  {
    if (books.get(i).getBookType().equals(bookType)){
      counter++;
    }
  }
  return counter;
}

public Book[] getBookByType(String type){
    ArrayList<Book> bookArrayList = new ArrayList<>();

  for (int i = 0; i < books.size(); i++)
  {
    if (books.get(i).getBookType().equals(type)){
      bookArrayList.add(books.get(i));
    }
  }

  Book[] returnBook = (Book[]) books.toArray();
return returnBook;
}









}
