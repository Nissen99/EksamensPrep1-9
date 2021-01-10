import java.util.Arrays;
import java.util.ArrayList;

public class Hotel
{
  private String name;
  private ArrayList<Room> rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = new ArrayList<>();
    this.rooms.addAll(Arrays.asList(rooms));
  }

  public String getName(){
    return name;
  }

  public int getNumberOfRooms(){
    return rooms.size();
  }

  public Room getFirstAvalableRoom(){
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied())
      {
        return rooms.get(i);
      }
    }
    return null;
  }













  public int getNumberOfAvialableRooms(){
    int counter= 0;

    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied())
      {
        counter++;
      }
    }
    return counter;
  }



}
