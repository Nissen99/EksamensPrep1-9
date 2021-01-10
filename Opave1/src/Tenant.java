public class Tenant
{
  private MyDate rentedFrom;
  private String name;


  public Tenant(String name)
  {
    this.name = name;
    this.rentedFrom = MyDate.now().copy();
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom.copy();
  }

  public String getName()
  {
    return name;
  }

  public void setRentedFrom(MyDate myDate){
    this.rentedFrom = myDate;
  }
}
