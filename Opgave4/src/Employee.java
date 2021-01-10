public abstract class Employee
{
  private String name;
  private Date birthday;




  public Employee(String name, Date birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
  }


  public String getName()
  {
    return name;
  }


  public void setName(String name){
    this.name = name;
  }

  public String toString(){
    return "Name: " + name + " birthday: " + birthday.toString();
  }

  public boolean equals(Object obj){

    if (!(obj instanceof Employee)){
      return false;
    }

    Employee other = (Employee) obj;
    return other.getBirthday().equals(birthday) && other.getName().equals(name);
  }

  public abstract double earningsPerWeek();

  public Date getBirthday()
  {
    return birthday.copy();
  }
}
