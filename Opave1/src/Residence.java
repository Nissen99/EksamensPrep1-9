public abstract class Residence
{
  private Tenant rentedTo;
  private int number;
  private double size;
  private String type;

  public Residence(int number, double size, String type)
  {
    this.number = number;
    this.size = size;
    this.type = type;
  }

  public boolean isAvailable(){
    if (rentedTo == null){
      return true;
    }
    return false;
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom){
    if (this.rentedTo == null){
      rentedTo = tenant;
      rentedTo.setRentedFrom(MyDate.now().copy());
    }

  }

  public Tenant getRentedTo(){
    return rentedTo;
  }


  public abstract int getNumberOfRooms();


  public int getNumber()
  {
    return number;
  }

  public double getSize()
  {
    return size;
  }

  public String getType()
  {
    return type;
  }
}
