public class Bed
{
  private String type;


  public Bed(String type){
    this.type = type;
  }


  public boolean isSingle(){
    if (type.equals("Single")){
      return true;
    }
    return false;
  }

  public boolean isDouble(){
    if (type.equals("Double")){
      return true;
    }
    return false;
  }

  public boolean isKingSize(){
    if (type.equals("King size")){
      return true;
    }
    return false;
  }
}
