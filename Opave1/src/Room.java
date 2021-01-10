public class Room extends Residence
{

  public Room(int number, double size)
  {
    super(number, size, "room");
  }

  @Override public int getNumberOfRooms()
  {
    return 1;
  }
}
