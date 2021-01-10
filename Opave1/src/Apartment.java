public class Apartment extends Residence
{
  private int numberOfRooms;

  public Apartment(int number, double size, int numberOfRooms)
  {
    super(number, size, "Apartment");
    this.numberOfRooms = numberOfRooms;
  }

  @Override public int getNumberOfRooms()
  {
    return numberOfRooms;
  }
}
