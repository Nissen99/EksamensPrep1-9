public class EmployeeList
{
  private int size;
  private Employee[] employees;

  public EmployeeList(int maxEmployees){
    size = 0;
    employees = new Employee[maxEmployees];
  }

  public void addEmployee(Employee employee){
    if (employees.length > size)
    {
      employees[size] = employee;
    }
  }
  public void removeEmployee(Employee employee){

    for (int i = 0; i < employees.length; i++)
    {
      if (employees[i] != null){
        if (employees[i].equals(employee)){
          employees[employees.length-1] = null;
          size--;
          for (int j = i; j < employees.length-1; j++)
          {
            employees[j] = employees[j+1];
          }
        }
      }
    }
  }

  public int getNumberOfEmployees(){
    return size;
  }

  public Employee[] getEmployees(){
    return employees;
  }

  public double getTotalEarningsPerWeek(){

    double counter = 0;
    for (int i = 0; i < employees.length; i++)
    {
     counter += employees[i].earningsPerWeek();

    }
    return counter;
  }

  public String toString(){
    String other = "There are " + size +" Employees, they are: ";

    for (int i = 0; i < employees.length; i++)
    {
      other += ", " + employees[i].toString();
    }
    return other;
  }

  public boolean equals(Object obj){

    if (!(obj instanceof EmployeeList)){
      return false;
    }

    EmployeeList other = (EmployeeList) obj;
    boolean tracker = true;

    for (int i = 0; i < employees.length; i++)
    {
      if (!other.getEmployees()[i].equals(employees[i])){
        tracker= false;
      }
    }
    return tracker;
  }


}
