public class HourlyEmployee extends Employee
{

  private double wagePerHour;
  private double hoursWorkedPerWeek;



  public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek)
  {
    super(name, birthday);
    this.wagePerHour = wagePerHour;
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;

  }




  public String toString(){

    return super.toString() + " Wage: " + wagePerHour + " Hours Worked: " + hoursWorkedPerWeek;
  }

  public boolean equals(Object obj){

    if (!(obj instanceof HourlyEmployee)){
      return false;
    }

    HourlyEmployee other = (HourlyEmployee) obj;

    return other.hoursWorkedPerWeek == hoursWorkedPerWeek &&
        other.wagePerHour == wagePerHour && super.equals(obj);
  }

  public void setWagePerHour(double wage){
    this.wagePerHour = wage;
  }


  public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
  {
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public double getWagePerHour()
  {
    return wagePerHour;
  }

  public double getHoursWorkedPerWeek()
  {
    return hoursWorkedPerWeek;
  }

  @Override public double earningsPerWeek()
  {
    return wagePerHour*hoursWorkedPerWeek;
  }
}
