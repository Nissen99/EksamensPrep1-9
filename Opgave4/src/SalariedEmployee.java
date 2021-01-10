public class SalariedEmployee extends Employee
{

  private double weeklySalary;




  public SalariedEmployee(String name, Date birthday, double weeklySalary)
  {
    super(name, birthday);
    this.weeklySalary = weeklySalary;
  }


  public boolean equals(Object obj){

    if (!(obj instanceof SalariedEmployee)){
  return false;
    }

    SalariedEmployee other = (SalariedEmployee) obj;
    return other.getWeeklySalary() == weeklySalary && super.equals(obj);
  }

  public String toString(){
    return super.toString() + " Salary: " + weeklySalary;
  }

  public void setWeeklySalary(double weeklySalary)
  {
    this.weeklySalary = weeklySalary;
  }

  public double getWeeklySalary()
  {
    return weeklySalary;
  }

  @Override public double earningsPerWeek()
  {
    return weeklySalary;
  }
}
