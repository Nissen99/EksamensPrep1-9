public class Test
{
  public static void main(String[] args)
  {


    SalariedEmployee mikkel = new SalariedEmployee("Mikkel", new Date(1,2,2000),800);
    SalariedEmployee mikkel2 = new SalariedEmployee("Mikkel", new Date(1,2,2000),800);
    SalariedEmployee mikkel3 = new SalariedEmployee("Mikkel", new Date(1,2,2000),800);
    SalariedEmployee mikkel4 = new SalariedEmployee("Mikkel", new Date(1,2,2000),800);
    HourlyEmployee mikkel5 = new HourlyEmployee("Mikkel", new Date(1,2,2000),800,20);
    HourlyEmployee mikkel6 = new HourlyEmployee("Mikkel", new Date(1,2,2000),800, 20);

    System.out.println(mikkel6.equals(mikkel4));



  }
}
