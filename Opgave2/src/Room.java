public class Room
{
  private Guest guest;
  private Bed bed;
  private int number;


  public Room(int number, String bedType){
    this.number = number;
    this.bed = new Bed(bedType);
  }



  public double getPrice(){

    double singlePrice = 59.50;
    double doublePrice = 72.40;
    double kingSizePrice = 89.00;

    if (bed.isSingle()){
      return singlePrice;
    }
    else if (bed.isDouble()){
      return doublePrice;
    }
    else if (bed.isKingSize()){
      return kingSizePrice;
    }
    return 0;
  }


  public boolean isOccupied(){
    if (guest == null){
      return false;
    }
    return true;
  }

  public void registerGuest(Guest guest){
    if (!isOccupied()){
      this.guest = guest;
    }
  }

  public void vacate(){
    this.guest = null;
  }

  public String getBedType(){

    if (bed.isSingle()){
      return "Single";
    }
    else if (bed.isDouble()){
      return "Double";
    }
    else if (bed.isKingSize()){
      return "King Size";
    }
    return "No bed";
  }

  public Guest getGuest(){
    return guest;
}


  public int getFloor(){

    return number/100;
  }


  public int getNumber()
  {
    return number;
  }
}
