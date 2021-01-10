public class PrintedBook extends Book
{

  private boolean isPaperback;

  public PrintedBook(String title, String isbn, boolean paperback)
  {
    super(title, isbn);
    isPaperback = paperback;
  }

  public boolean isPaperback()
  {
    return isPaperback;
  }

  @Override public String getBookType()
  {

    if (isPaperback){
      return "Paperback";
    }
    return "Hard cover";
  }

  public String toString(){

    return "Book type: " + getBookType() + " " + super.toString();
  }

  public boolean equals(Object obj){

    if (!(obj instanceof PrintedBook)){
      return false;
    }

    PrintedBook other = (PrintedBook) obj;
    return other.isPaperback == isPaperback() && super.equals(obj);
  }



}
