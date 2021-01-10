public class EBook extends Book
{

  private String url;

  public EBook(String url,String title, String isbn)
  {
    super(title, isbn);
    this.url = url;
  }

  @Override public String getBookType()
  {
    return "E-book";
  }

  public String getUrl()
  {
    return url;
  }

  public String toString(){

    return "Url: " + url + " " + super.toString();
  }

  @Override
  public boolean equals(Object obj){

    if (!(obj instanceof EBook)){
      return false;
    }

    EBook other = (EBook) obj;
    return super.equals(obj) && other.url.equals(url);
  }
}
